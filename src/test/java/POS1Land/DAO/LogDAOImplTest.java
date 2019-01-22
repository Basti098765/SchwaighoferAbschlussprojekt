package POS1Land.DAO;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class LogDAOImplTest {
    private LogDAO logDao;


    @Test
    public void createLog() {

        Log l = new Log(9999, "test", 123, 125);
        boolean testval = false;
        logDao = new LogDAOImpl();
        logDao.createLog(l);
        List<Log> loglist = logDao.getAllLogs();
        for (Log logtest : loglist) {
            if (logtest.getVariante() == "test") {
                testval = true;
                logDao.deleteLog(logtest);
            }
        }

        assertTrue(testval);
    }
}