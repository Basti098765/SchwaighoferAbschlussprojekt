package POS1Land.Calc;

public class Euro2Dollar extends WR {

    private static double kurs = 1.14;

    public Euro2Dollar()
    {
        this.var = "Euro2Dollar";
    }

    @Override
    protected double calc(double betrag) {
        return betrag * kurs;
    }


}
