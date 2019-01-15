package POS1Land.Decorator;

import POS1Land.Calc.IUmrechnen;

public class TaxCalcDecorator extends CalcDecorator {

    public TaxCalcDecorator(IUmrechnen decoratedCalc) {
        super(decoratedCalc);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        double geb = betrag * 0.05;
        double erg = betrag - geb;
        double calcErg = decoratedCalc.umrechnen(variante, erg);
        System.out.println("Umrechnungsvorgang, " + variante + " mit dem Startbetrag von " + betrag + " Abzüglich von: " + geb + " Gebühren: " + erg);
        System.out.println("Ergebnis: " + calcErg);
        return calcErg;


    }


}
