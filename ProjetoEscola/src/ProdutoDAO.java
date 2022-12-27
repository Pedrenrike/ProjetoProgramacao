import java.sql.*;
import java.util.*;
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
    public boolean consultarProduto(String nome){
        String sql="select * from produto;";
        boolean achou = false;
        
        try {
            PreparedStatement sttmt=connection.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                if(nome.equals(rst.getString("nome"))){
                    
                    String produto = rst.getString("nome");
                    int quant = rst.getInt("quant");
                    Double valor = rst.getDouble("valor");
                    double comissão = rst.getDouble("comissão");
                    String descrição = rst.getString("descrição");
                    
                    achou = true;
                    
                    Vender v  = new Vender(produto, quant, valor, comissão, descrição);
                }
                else{
                    System.out.println("Deu erro!");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
        return achou;
    }
    
    public ArrayList<Produto> pegarProdutos(){
        String sql="select * from produto;";
        ArrayList<Produto> p = new ArrayList<>();
        
        try{
        PreparedStatement sttmt=connection.prepareStatement(sql);
        ResultSet rst=sttmt.executeQuery();
        
        while(rst.next()){
            Produto produto = new Produto();
            
            produto.setId(rst.getInt("id"));
            produto.setNome(rst.getString("nome"));
            produto.setQuant(rst.getInt("quant"));
            produto.setValor(rst.getDouble("valor"));
            produto.setComissão(rst.getDouble("comissão"));
            produto.setDescrição(rst.getString("descrição"));
            
            p.add(produto);
        }
        } catch(SQLException ex) {
            System.out.println("Deu erro.");
        }
        return p;
    }
}
