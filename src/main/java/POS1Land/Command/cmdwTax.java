package POS1Land.Command;

import POS1Land.Calc.ChainManager;
import POS1Land.Calc.IUmrechnen;
import POS1Land.Calc.WR;
import POS1Land.DAO.LogDAO;
import POS1Land.DAO.LogDAOImpl;
import POS1Land.Decorator.TaxCalcDecorator;

public abstract class cmdwTax implements Command {
    protected WR e2d;
    protected IUmrechnen taxDec;
    protected LogDAO logDAO;

    public cmdwTax() {
        e2d = ChainManager.getChainOfCalculators();
        taxDec = new TaxCalcDecorator(e2d);
        logDAO = new LogDAOImpl();
    }
}
