package POS1Land.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LogDAOImpl implements LogDAO {
    List<Log> logs;
    private Connection myConn;
    private Statement myStmt;

    public LogDAOImpl() {
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsfinal_db", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        logs = new ArrayList<>();
    }

    @Override
    public List<Log> getAllLogs() {
        try {
            ResultSet myResult = myStmt.executeQuery("SELECT * FROM log_tbl");
            while (myResult.next()) {
                Log l = new Log(myResult.getInt("id"), myResult.getString("variante"), myResult.getDouble("betrag"), myResult.getDouble("ergebnis"), myResult.getDate("date"));
                logs.add(l);
            }
        } catch (SQLException e) {

        }
        return logs;
    }

    @Override
    public Log getLog(int id) {

        Log l = null;
        try {
            ResultSet myResult = myStmt.executeQuery("SELECT * FROM log_tbl WHERE id='" + id + "'");

            l = new Log(myResult.getInt("id"), myResult.getString("variante"), myResult.getDouble("betrag"), myResult.getDouble("ergebnis"), myResult.getDate("date"));


        } catch (SQLException e) {

        }
        return l;
    }

    @Override
    public void updateLog(Log log) {
        try {
            Date date = log.getDate();
            String variante = log.getVariante();
            double betrag = log.getBetrag();
            double ergebnis = log.getErgebnis();
            int id = log.getId();
            String sql = "UPDATE log_tbl SET date = '" + date + "', variante = '" + variante + "', `betrag` = '" + betrag + "', ergebnis = '" + ergebnis + "' WHERE log_tbl.id ='" + id + "'";
            myStmt.executeUpdate(sql);
            System.out.println("Update complete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteLog(Log log) {
        int id = log.getId();
        try {
            String sql = "DELETE FROM log_tbl WHERE id='" + id + "'";
            myStmt.executeUpdate(sql);
            System.out.println("Delete complete");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createLog(Log log) {
        try {
            String sql = "INSERT INTO log_tbl(variante,betrag,ergebnis,datum)VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = myConn.prepareStatement(sql);

            preparedStatement.setString(1, log.getVariante());
            preparedStatement.setDouble(2, log.getBetrag());
            preparedStatement.setDouble(3, log.getErgebnis());
            preparedStatement.setDate(4, log.getDate());
            preparedStatement.executeUpdate();
            System.out.println("Log Created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
