package POS1Land;

import POS1Land.Calc.ChainManager;
import POS1Land.Calc.WR;
import POS1Land.Decorator.CalcDecorator;
import POS1Land.Decorator.DefCalcDecorator;

public class Adapter implements ISammelumrechnung {

    @Override
    public double sammelumrechnen(double[] betraege, String variante) {
        double sum = 0;
        WR e2d = ChainManager.getChainOfCalculators();
        for (int i = 0; i < betraege.length; i++) {
            CalcDecorator c = new DefCalcDecorator(e2d);
            sum = sum + c.umrechnen(variante, betraege[i]);
        }
        System.out.println("Summe der Beträge: " + sum);
        return sum;
    }
}
