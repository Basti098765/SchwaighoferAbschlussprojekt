package POS1Land.Calc;

public class ChainManager {

    public static WR getChainOfCalculators() {
        WR euro2dollar = new Euro2Dollar();
        WR euro2yen = new Euro2Yen();

        euro2dollar.setNextCalc(euro2yen);

        return euro2dollar;
    }
}
