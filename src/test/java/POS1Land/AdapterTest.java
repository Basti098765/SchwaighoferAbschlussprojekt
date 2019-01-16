package POS1Land;

import POS1Land.Calc.ChainManager;
import POS1Land.Calc.WR;
import POS1Land.Decorator.CalcDecorator;
import POS1Land.Decorator.DefCalcDecorator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdapterTest {

    @Test
    public void sammelumrechnen() {
        double sum = 0;
        double[] betraege = new double[]{1, 2, 3, 4, 5};

        WR e2d = ChainManager.getChainOfCalculators();
        for (int i = 0; i < betraege.length; i++) {
            CalcDecorator c = new DefCalcDecorator(e2d);
            sum = sum + c.umrechnen("Euro2Dollar", betraege[i]);

        }
        System.out.println(sum);
        double kurs = 1.14;
        double value = 1 * kurs + 2 * kurs + 3 * kurs + 4 * kurs + 5 * kurs;
        assertTrue(value == sum);
    }
}