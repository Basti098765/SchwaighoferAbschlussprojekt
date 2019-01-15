package POS1Land;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WR e2d = ChainManager.getChainOfCalculators();
        IUmrechnen tax = new TaxCalcDecorator(e2d);
        tax.umrechnen("Euro2Dollar", 20);

    }
}
