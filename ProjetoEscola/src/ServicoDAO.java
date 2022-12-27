import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ServicoDAO {
    Connection connection;

    public ServicoDAO() {
        connection = new Conexao().getConexao();
    }
    
    public void inserirServico(Servico s) {
        String sql = "insert into servico(id, nome) values (?, ?);";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setInt(1, s.getId());
            ps.setString(2, s.getNome());
            
            ps.executeUpdate();
            System.out.println("Serviço contratado!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir serviço: " + e);
        }
    }
}
