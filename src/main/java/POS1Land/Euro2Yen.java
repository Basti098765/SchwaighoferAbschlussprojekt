package POS1Land;

public class Euro2Yen extends WR {
    private static double kurs = 123.71;
    protected WR nextCalc;
    @Override
    public double umrechnen(String variante, double betrag) {
        if (variante.equals("Euro2Yen")) {
            return kurs*betrag;
        } else {
            if (nextCalc != null) {
                return nextCalc.umrechnen(variante, betrag);
            } else {
                return -1;
            }



        }
    }
}
