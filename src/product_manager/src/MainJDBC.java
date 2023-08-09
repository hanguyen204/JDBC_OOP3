import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainJDBC {
    public static void main(String[] args) throws SQLException {
        ConnectionJDBC connectionJDBC = new ConnectionJDBC();
        Connection connection = connectionJDBC.connect();
//        addRecordFromDatabase(connection);
//        updateRecordFromDatabase(connection);
//        deleteRecordFromDatabase(connection);
        selectRecordFromDatabase(connection);
        connection.close();
    }

    private static void selectRecordFromDatabase(Connection connection) throws SQLException {
    String query = "select * from products ";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double price = rs.getDouble("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            int number = rs.getInt("number");
            boolean status = rs.getBoolean("status");
            System.out.println("id: " + id + " name: "+ name+" price: " +price + " detail: "+ detail +" manufacturer: " + manufacturer+" number: " + number +" status" +status);
        }
    }


    private static void deleteRecordFromDatabase(Connection connection) throws SQLException {
    String query = "delete from products where id = 4 ";
    Statement statement = connection.createStatement();
    int row = statement.executeUpdate(query);
    if (row != 0){
        System.out.println("Thanh Cong");
    }
    }

    private static void updateRecordFromDatabase(Connection connection) throws SQLException {
        String query = "update products set number = 20,price = 0 where id = 6";
        Statement statement = connection.createStatement();
        int row = statement.executeUpdate(query);
        if(row != 0){
            System.out.println("Thanh Cong");
        }
    }

    private static void addRecordFromDatabase(Connection connection) throws SQLException {
    String query = "insert into products(name,price,detail,manufacturer,number,status) values ('Khoai Tay',70000,'hat nho','hang nong thon',22,1)";
    Statement statement = connection.createStatement();
    int row = statement.executeUpdate(query);
    if (row != 0){
        System.out.println("Them Thanh Cong!");
    }
    }

}
