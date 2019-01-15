package POS1Land;

public abstract class WR implements IUmrechnen {
    protected IUmrechnen nextCalc;
    protected String var;


    public void setNextCalc(IUmrechnen nextCalc) {
        this.nextCalc = nextCalc;
    }

    public double umrechnen(String variante, double betrag) {
        if (this.var == variante) {
            System.out.print("Umrechnungsvorgang, ");
            return calc(betrag);
        }
        if (nextCalc != null) {
            return nextCalc.umrechnen(variante, betrag);
        } else {
            return 0;
        }


    }

    abstract protected double calc(double betrag);
}
