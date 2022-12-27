import java.sql.*;
import java.util.*;

public class ProdutoDAO {
    Connection connection;

    public ProdutoDAO() {
        connection = new Conexao().getConexao();
    }
    
    public void inserirProduto(Produto p) {
        String sql = "insert into produto(nome, descricao, quantidade, comissao, valor) values (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getDescricao());
            ps.setInt(3, p.getQuantidade());
            ps.setDouble(4, p.getComissao());
            ps.setDouble(5, p.getValor());
            
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
                    double comissão = rst.getDouble("comissao");
                    String descrição = rst.getString("descricao");
                    
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
            produto.setQuantidade(rst.getInt("quant"));
            produto.setValor(rst.getDouble("valor"));
            produto.setComissao(rst.getDouble("comissão"));
            produto.setDescricao(rst.getString("descrição"));
            
            p.add(produto);
        }
        } catch(SQLException ex) {
            System.out.println("Deu erro.");
        }
        return p;
    }
    
    public ArrayList<Produto> pesquisarProduto() {
        String sql = "select * from produto";
        ArrayList<Produto> produtos = new ArrayList();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setComissao(rs.getDouble("comissao"));
                produto.setValor(rs.getDouble("valor"));
                
                produtos.add(produto);
            }
            
        } catch (SQLException e) {
            System.out.println("Erro na pesquisa do produto: " + e);
        }
        
        return produtos;
    }
    
    public ArrayList<Produto> pesquisarProdutoNome(Produto p) {
        String sql = "select * from produto where nome like ?";
        ArrayList<Produto> produtos = new ArrayList();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%" + p.getNome() + "%");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Produto produto = new Produto();
                
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("nome"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setComissao(rs.getDouble("comissao"));
                produto.setValor(rs.getDouble("valor"));
                
                produtos.add(produto);
            }
            
        } catch(SQLException e) {
            System.out.println("Erro na pesquia de produto por nome: " + e);
        }
        
        return produtos;
    }
}
