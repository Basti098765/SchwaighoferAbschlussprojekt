package POS1Land.Decorator;

import POS1Land.Calc.IUmrechnen;

public class DefCalcDecorator extends CalcDecorator {

    public DefCalcDecorator(IUmrechnen decoratedCalc) {
        super(decoratedCalc);
    }

    public double umrechnen(String variante, double betrag) {
        double value = decoratedCalc.umrechnen(variante, betrag);
        System.out.println("Umrechnungsvorgang, " + variante + " mit dem Startbetrag von " + betrag);
        System.out.println("Ergebnis: " + value);
        return value;
    }


}
