import java.sql.*;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    Connection connection;

    public ProdutoDAO() {
        connection = new Conexao().getConexao();
    }
    
    public void inserirProduto(Produto p) {
        String sql = "insert into produto(id, nome) values (?, ?);";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNome());
            
            ps.executeUpdate();
            System.out.println("Produto cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e);
        }
    }
    public void consultarProduto(String nome){
        String sql="select * from produto;";
        
        try {
            PreparedStatement sttmt=connection.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                if(nome.equals(rst.getString("nome"))){
                    int id = rst.getInt("id"); 
                    System.out.println("Dados do banco: "+nome+" "+id);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    }
}
