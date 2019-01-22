package POS1Land.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection instance = new DbConnection();

    private DbConnection() {
    }

    public static DbConnection getInstance() {
        return instance;
    }

    public Connection Connect() {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/wsfinal_db";
            String user = "root";
            String password = "";


            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
