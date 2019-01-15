package POS1Land;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WR e2d = new Euro2Dollar();
        WR e2y = new Euro2Yen();
        e2d.setNextCalc(e2y);


        System.out.println( e2d.umrechnen("Euro2Dollar",20));
        System.out.println(e2y.umrechnen("Euro2Yen",10));
    }
}
