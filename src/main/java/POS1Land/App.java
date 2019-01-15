package POS1Land;

import POS1Land.Command.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Command c = new cmdE2DwoT();
        Command d = new cmdE2DwT();
        c.exec(22);
        d.exec(22);

        Command e = new cmdE2YwoT();
        Command f = new cmdE2YwT();

        e.exec(22);
        f.exec(22);

    }
}
