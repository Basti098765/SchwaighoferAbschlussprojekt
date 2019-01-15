package POS1Land.Command;

import POS1Land.DAO.Log;

public class cmdE2YwoT extends cmdwoTax {

    @Override
    public void exec(double betrag) {
        Log l = new Log("Euro2Yen", betrag, defDec.umrechnen("Euro2Yen", betrag));
        logDAO.createLog(l);

    }
}
