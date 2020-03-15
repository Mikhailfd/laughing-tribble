package project.connected;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    private static final String DATABASE_URL =
            "jdbc:mysql://localhost:3306/Dostavka";
    private static final String USER = "root";
    private static final String PASS = "root";

    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {

        return connection;
    }
}
