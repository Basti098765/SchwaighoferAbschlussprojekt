package POS1Land.Command;

import POS1Land.Calc.ChainManager;
import POS1Land.Calc.IUmrechnen;
import POS1Land.Calc.WR;
import POS1Land.DAO.LogDAO;
import POS1Land.DAO.LogDAOImpl;
import POS1Land.Decorator.DefCalcDecorator;


public abstract class cmdwoTax implements Command {
    protected WR e2d;
    protected IUmrechnen defDec;
    protected LogDAO logDAO;

    public cmdwoTax() {
        e2d = ChainManager.getChainOfCalculators();
        defDec = new DefCalcDecorator(e2d);
        logDAO = new LogDAOImpl();
    }
}
