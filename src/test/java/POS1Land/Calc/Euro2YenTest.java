package POS1Land.Calc;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class Euro2YenTest {
    private Random r = new Random();
    double value = r.nextDouble();

    @Test
    public void calc() {
        Euro2Yen euro2Yen = new Euro2Yen();
        assertTrue(euro2Yen.calc(value) == value * 123.71);
    }


}