package POS1Land;

public class Euro2Yen extends WR {
    private static double kurs = 123.71;

    public Euro2Yen()
    {
        this.var = "Euro2Yen";
    }

    @Override
    protected double calc(double betrag) {
        System.out.print("Variante Euro to Yen mit dem Betrag  " + betrag + " Euro Ergebnis: ");
        return betrag * kurs;
    }
}
