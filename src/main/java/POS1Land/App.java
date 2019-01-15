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


        System.out.println( e2d.umrechnen("Euro2Dollar",20));
        System.out.println(e2d.umrechnen("Euro2Yen", 10));
        System.out.println(e2d.umrechnen("Euro2Yen", 12));
        System.out.println(e2d.umrechnen("Euro2Dollar", 24));

    }
}
