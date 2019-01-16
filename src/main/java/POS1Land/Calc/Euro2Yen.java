package POS1Land.Calc;

public class Euro2Yen extends WR {
    private static double kurs = 123.71;

    public Euro2Yen() {
        this.var = "Euro2Yen";
    }

    @Override
    protected double calc(double betrag) {
        return betrag * kurs;
    }
}
