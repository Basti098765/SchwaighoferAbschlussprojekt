package POS1Land;

public class Euro2Dollar extends WR {

    private static double kurs = 1.14;

    public Euro2Dollar()
    {
        this.var = "Euro2Dollar";
    }

    @Override
    protected double calc(double betrag) {
        System.out.print("Variante Euro to Dollar mit dem Betrag  " + betrag + " Euro Ergebnis: ");
        return betrag * kurs;
    }


}
