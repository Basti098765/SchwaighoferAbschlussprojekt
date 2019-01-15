package POS1Land.DAO;

import java.util.List;

public interface LogDAO {
    List<Log> getAllLogs();

    Log getLog(int id);

    void updateLog(Log log);

    void deleteLog(Log log);

    void createLog(Log log);
}
