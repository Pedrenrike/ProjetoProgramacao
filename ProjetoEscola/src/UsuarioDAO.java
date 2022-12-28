import java.sql.*;

public class UsuarioDAO {
    Connection connection;

    public UsuarioDAO() {
        connection = new Conexao().getConexao();
    }
    
    public void inserirUsuario(Usuario usuario) {
        String sql = "insert into usuario(login, senha, cpf, idade, telefone, cidade, atendente) values (?, ?, ?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getCpf());
            ps.setInt(4, usuario.getIdade());
            ps.setString(5, usuario.getTelefone());
            ps.setString(6, usuario.getCidade());
            ps.setBoolean(7, usuario.isAtendente());
            
            ps.executeUpdate();
            System.out.println("Usuario cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro no inserimento do usuario: " + e);
        }
    }
    
    public ResultSet autenticacaoLogin(Usuario u) {
        String sql = "select * from usuario where login = ? and senha = ? and atendente = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, u.getLogin());
            ps.setString(2, u.getSenha());
            ps.setBoolean(3, u.isAtendente());
            
            ResultSet rs = ps.executeQuery();
            
            return rs;
        } catch (SQLException e) {
            System.out.println("Erro ao tentar logar: " + e);
            return null;
        }
    }
    
    public void consultarTudo(){
        String sql="select * from usuario;";
        
        try {
            PreparedStatement sttmt=connection.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String n = rst.getString("nome");
                int i = rst.getInt("id");
                System.out.println("Dados do banco: "+n+" "+i);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    }
}