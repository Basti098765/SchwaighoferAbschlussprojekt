package POS1Land;

public abstract class WR implements IUmrechnen
{
    protected WR nextCalc;
    protected double kurs;

    public void setNextCalc(WR nextCalc)
    {
        this.nextCalc=nextCalc;
    }
    public double umrechnen(String variante, double betrag) {

       return betrag*kurs;

}
}
