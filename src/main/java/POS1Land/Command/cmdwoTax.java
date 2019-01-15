package POS1Land.Command;

import POS1Land.Calc.WR;
import POS1Land.ChainManager;
import POS1Land.Decorator.DefCalcDecorator;
import POS1Land.IUmrechnen;


public abstract class cmdwoTax implements Command {
    protected WR e2d;
    protected IUmrechnen defDec;

    public cmdwoTax() {
        e2d = ChainManager.getChainOfCalculators();
        defDec = new DefCalcDecorator(e2d);
    }
}
