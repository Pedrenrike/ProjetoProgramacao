import java.sql.*;

public class ServicoDAO {
    Connection connection;

    public ServicoDAO() {
        connection = new Conexao().getConexao();
    }
    
    public void inserirServico(Servico s) {
        String sql = "insert into servico(nome, descricao, valor) values (?, ?, ?);";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, s.getNome());
            ps.setString(2, s.getDescricao());
            ps.setDouble(3, s.getValor());
            
            ps.executeUpdate();
            System.out.println("Serviço contratado!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir serviço: " + e);
        }
    }
}
