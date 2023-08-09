import java.sql.*;

public class ConnectJDBC {
    private String hostName = "localhost:3306";
    private String dbName = "demo_jdbc";
    private String username = "root";
    private String password = "2004";

    private String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

    public Connection connect() throws SQLException {
        Connection con = null;
        con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}

class MainTest {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
//      select record from database
//        SelectRecordFromDatabase(connection);
//       Add Record
//        addRecordToDatabase(connection);
//      Update Record
//        updateRecordToDatabase(connection);
//      Delete Record
        deletaRecordToDatabase(connection);
    }

    private static void deletaRecordToDatabase(Connection connection) throws SQLException {
        String query = "delete from users where id = 5";
        Statement statement = null;
        statement = connection.createStatement();
        int row = statement.executeUpdate(query);
        if (row != 0){
            System.out.println("Finish delete");
        }
        connection.close();
    }

    private static void updateRecordToDatabase(Connection connection) throws SQLException {
     String query = "update users set password = 'bichthuan123' where id = 5";
     Statement statement = null;
     statement = connection.createStatement();
     int row = statement.executeUpdate(query);
     if (row != 0 ){
         System.out.println("Them Thanh Cong" + row);
     }
     connection.close();
    }

    private static void addRecordToDatabase(Connection connection) throws SQLException {
        String query = "insert into users(id,username,password,email) values (5 ,'DoBichThuan','123456789','thuan.do@codegym.vn')";
        Statement statement = null;
        statement = connection.createStatement();
        int row = statement.executeUpdate(query);
        if (row != 0){
            System.out.println("Them thanh cong !");
        }
        connection.close();
    }

    private static void SelectRecordFromDatabase(Connection connection) throws SQLException {
        String query = "SELECT * From users";
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String email = rs.getString("email");
            System.out.println("ID: " +id + " Name: " +username + " password: " +password +" email: " +email);
            if (rs == null){
                break;
            }
        }
        connection.close();
    }

}
