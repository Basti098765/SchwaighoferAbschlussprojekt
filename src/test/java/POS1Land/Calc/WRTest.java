package POS1Land.Calc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class WRTest {

    @Test
    public void umrechnen() {
        WR e2d = new Euro2Dollar();
        WR e2y = new Euro2Yen();
        Random r = new Random();

        e2d.setNextCalc(e2y);

        double rand = r.nextDouble();
        Assert.assertTrue(e2d.umrechnen("Euro2Yen", rand) == e2y.umrechnen("Euro2Yen", rand));
        Assert.assertTrue(e2d.umrechnen("Euro2Dollar", rand) == rand * 1.14);

        Assert.assertTrue(e2d.umrechnen("Euro2Yen", rand) == rand * 123.71);
    }
}