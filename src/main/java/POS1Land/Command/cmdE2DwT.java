package POS1Land.Command;

public class cmdE2DwT extends cmdwTax {

    @Override
    public void exec(double betrag) {
        taxDec.umrechnen("Euro2Dollar", betrag);
    }
}
