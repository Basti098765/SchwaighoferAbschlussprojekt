package POS1Land;

public abstract class WR implements IUmrechnen
{
    protected WR nextCalc;
    protected double kurs;
    protected String var;


    public void setNextCalc(WR nextCalc)
    {
        this.nextCalc=nextCalc;
    }
    public double umrechnen(String variante, double betrag) {
        if(this.var==variante)
        {
            return kurs*betrag;
        }if(nextCalc!=null)
        {
            nextCalc.umrechnen(variante,betrag);
        }
       return betrag*kurs;

}
}
