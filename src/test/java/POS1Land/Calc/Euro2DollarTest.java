package POS1Land.Calc;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class Euro2DollarTest {
    private Random r = new Random();
    double value = r.nextDouble();

    @Test
    public void calc() {
        Euro2Dollar euro2Dollar = new Euro2Dollar();
        assertTrue(euro2Dollar.calc(value) == value * 1.14);
    }

    @Test
    public void setNextCalc() {
        Euro2Dollar euro2Dollar = new Euro2Dollar();
        Euro2Yen euro2Yen = new Euro2Yen();
        euro2Dollar.setNextCalc(euro2Yen);
        double tval = euro2Dollar.umrechnen("Euro2Yen", value);
        assertTrue(tval == value * 123.71);
    }


}