package POS1Land.Command;

import POS1Land.DAO.Log;

public class cmdE2YwT extends cmdwTax {

    @Override
    public void exec(double betrag) {
        Log l = new Log("Euro2Yen", betrag, taxDec.umrechnen("Euro2Yen", betrag));
        logDAO.createLog(l);
    }
}
