package POS1Land.DAO;

import org.junit.Test;

import java.util.List;
import java.util.ListIterator;

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
        ListIterator<Log> iter = loglist.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getVariante());
            if (iter.next().getVariante().equals("test")) {
                testval = true;
                logDao.deleteLog(iter.next());
            }
        }

        assertTrue(testval);
    }
}