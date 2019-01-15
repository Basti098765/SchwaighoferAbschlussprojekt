package POS1Land.Command;

import POS1Land.DAO.Log;

public class cmdE2DwT extends cmdwTax {

    @Override
    public void exec(double betrag) {
        Log l = new Log("Euro2DollarWTax", betrag, taxDec.umrechnen("Euro2Dollar", betrag));
        logDAO.createLog(l);

    }
}
