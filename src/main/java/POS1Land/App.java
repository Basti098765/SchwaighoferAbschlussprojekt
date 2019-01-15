package POS1Land;

import POS1Land.Calc.WR;
import POS1Land.Decorator.DefCalcDecorator;
import POS1Land.Decorator.TaxCalcDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WR e2d = ChainManager.getChainOfCalculators();
        IUmrechnen woTax = new DefCalcDecorator(e2d);
        IUmrechnen tax = new TaxCalcDecorator(e2d);
        tax.umrechnen("Euro2Dollar", 20);
        woTax.umrechnen("Euro2Dollar", 20);
        tax.umrechnen("Euro2Yen", 20);
        woTax.umrechnen("Euro2Yen", 20);

    }
}
