import java.sql.*;
public class ConnectionJDBC {
    private String hostname = "localhost:3306";
    private String dbname ="product_manager_database";
    private String users = "root";
    private String password = "2004";
    private String connectionURL = "jdbc:mysql://" + hostname +"/" + dbname;
    public Connection connect() throws SQLException {
        Connection con = null;
        con = DriverManager.getConnection(connectionURL,users,password);
        return con;
    }
}

