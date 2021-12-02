package connectivity;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionClass {
    public Connection connection;
    public Connection getconnection() throws ClassNotFoundException, SQLException {

        String dbName = "EVM";
        String userName = "root";
        String password = "";

        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName+userName+password);

    return connection;
    }
}
