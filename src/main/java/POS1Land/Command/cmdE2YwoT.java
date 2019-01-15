package POS1Land.Command;

public class cmdE2YwoT extends cmdwoTax {

    @Override
    public void exec(double betrag) {
        defDec.umrechnen("Euro2Yen", betrag);
    }
}
