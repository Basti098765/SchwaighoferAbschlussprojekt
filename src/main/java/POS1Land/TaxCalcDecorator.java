package POS1Land;

public class TaxCalcDecorator extends CalcDecorator {

    public TaxCalcDecorator(IUmrechnen decoratedCalc) {
        super(decoratedCalc);
    }

    @Override
    public double umrechnen(String variante, double betrag) {
        return decoratedCalc.umrechnen(variante, addTax(betrag));


    }

    public double addTax(double erg) {
        double geb = erg * 0.05;
        double ausg = erg - geb;
        System.out.print(" " + erg + " GEBÜHREN: " + geb + " EURO");
        System.out.println(" Auszahlung von: ");
        return ausg;
    }


}
