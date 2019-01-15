package POS1Land;

public abstract class WR implements IUmrechnen {
    protected WR nextCalc;
    protected String var;


    public void setNextCalc(WR nextCalc) {
        this.nextCalc = nextCalc;
    }

    public double umrechnen(String variante, double betrag) {
        if (this.var == variante) {
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
