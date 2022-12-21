import java.sql.*;

public class Conexao {
    static Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/projeto";
    String user = "root";
    String password = "password";

    public Conexao() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexao estabelecida!");
        } catch (SQLException e) {
            System.out.println("Problema na conexao: " + e.getMessage());
        }
    }

    public Connection getConexao() {
        return connection;
    }   
}
