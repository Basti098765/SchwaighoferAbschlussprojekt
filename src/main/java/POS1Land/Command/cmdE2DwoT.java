package POS1Land.Command;

import POS1Land.DAO.Log;

public class cmdE2DwoT extends cmdwoTax {

    @Override
    public void exec(double betrag) {
        Log l = new Log("Euro2Dollar", betrag, defDec.umrechnen("Euro2Dollar", betrag));
        logDAO.createLog(l);

    }
}
