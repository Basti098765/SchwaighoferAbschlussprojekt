package POS1Land.Command;

public class cmdE2DwoT extends cmdwoTax {

    @Override
    public void exec(double betrag) {
        defDec.umrechnen("Euro2Dollar", betrag);
    }
}
