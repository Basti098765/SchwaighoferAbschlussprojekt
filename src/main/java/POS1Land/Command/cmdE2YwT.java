package POS1Land.Command;

public class cmdE2YwT extends cmdwTax {

    @Override
    public void exec(double betrag) {
        taxDec.umrechnen("Euro2Yen", betrag);
    }
}
