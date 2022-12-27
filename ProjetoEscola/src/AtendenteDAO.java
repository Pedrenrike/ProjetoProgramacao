import java.sql.*;
import javax.swing.JOptionPane;

public class AtendenteDAO extends UsuarioDAO{

    public AtendenteDAO() {
        connection = new Conexao().getConexao();
    }
    
    public Atendente consultarAtendente(String atendente){
        String sql1="select * from usuario;";
        String sql2="select * from atendente;";
        
        Atendente a = new Atendente();
        
        try {
            PreparedStatement sttmt1=connection.prepareStatement(sql1);
            ResultSet rst1=sttmt1.executeQuery();
            PreparedStatement sttmt2=connection.prepareStatement(sql2);
            ResultSet rst2=sttmt2.executeQuery();
            while(rst1.next()){
                if(atendente.equals(rst1.getString("login"))){
                    a.setLogin(rst1.getString("login"));
                    a.setTelefone(rst1.getString("telefone"));
                    a.setNota(rst2.getDouble("nota"));
                    a.setSalario(rst2.getDouble("salario"));
                    a.setAvaliadores(rst2.getInt("avaliadores"));
                    a.setId(rst2.getInt("id"));
                            
                    JOptionPane.showMessageDialog(null, "Atendente encontrado com sucesso!");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
        return a;
    }
    
    public double getNota(int id){
        String sql = "Select * from atendente where id = ?;";
        double nota = 0;
                
        try {
            PreparedStatement sttmt=connection.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            
            nota = rst.getDouble("nota");
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
        
        return nota;
    }
    
    public void setNota(int id, Double nota, int avaliadores){
        String sql = "insert into atendente(nota, avaliadores) values (?, ?) where id = ?;";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setDouble(1, nota);
            ps.setInt(2, avaliadores);
            ps.setInt(3, id);
            
            ps.executeUpdate();
            System.out.println("Nota modificada!");
        } catch (SQLException e) {
            System.out.println("Erro no inserimento do usuario: " + e);
        }
    }
}