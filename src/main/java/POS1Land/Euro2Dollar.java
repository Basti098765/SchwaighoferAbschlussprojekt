package POS1Land;

public class Euro2Dollar extends WR {
    private static double kurs = 1.14;
    protected WR nextCalc;

    @Override
        public double umrechnen(String variante, double betrag) {
            if (variante.equals("Euro2Dollar")) {
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
