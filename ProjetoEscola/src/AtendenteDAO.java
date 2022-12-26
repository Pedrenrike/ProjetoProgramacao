import java.sql.*;
import javax.swing.JOptionPane;

public class AtendenteDAO extends UsuarioDAO{

    public AtendenteDAO() {
        connection = new Conexao().getConexao();
    }
    
    public Atendente consultarFuncionario(String func){
        String sql1="select * from pessoa;";
        String sql2="select * from funcionario;";
        
        Atendente a = new Atendente();
        
        try {
            PreparedStatement sttmt1=connection.prepareStatement(sql1);
            ResultSet rst1=sttmt1.executeQuery();
            PreparedStatement sttmt2=connection.prepareStatement(sql2);
            ResultSet rst2=sttmt2.executeQuery();
            while(rst1.next()){
                
                
                if(func.equals(rst1.getString("login"))){
                    a.setLogin(rst1.getString("login"));
                    a.setTelefone(rst1.getString("telefone"));
                    a.setNota(rst2.getDouble("nota"));
                    
                    JOptionPane.showMessageDialog(null, "Atendente encontrado com sucesso!");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
        return a;
    }
}