package POS1Land.Command;

import POS1Land.Calc.WR;
import POS1Land.ChainManager;
import POS1Land.Decorator.TaxCalcDecorator;
import POS1Land.IUmrechnen;

public abstract class cmdwTax implements Command {
    protected WR e2d;
    protected IUmrechnen taxDec;

    public cmdwTax() {
        e2d = ChainManager.getChainOfCalculators();
        taxDec = new TaxCalcDecorator(e2d);
    }
}
