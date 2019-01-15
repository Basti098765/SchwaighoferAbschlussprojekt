package POS1Land.Decorator;

import POS1Land.IUmrechnen;

public abstract class CalcDecorator implements IUmrechnen {
    protected IUmrechnen decoratedCalc;

    public CalcDecorator(IUmrechnen decoratedCalc) {
        this.decoratedCalc = decoratedCalc;
    }

    public double umrechnen(String variante, double betrag) {
        return decoratedCalc.umrechnen(variante, betrag);
    }

}
