package POS1Land;

import POS1Land.Calc.Euro2Dollar;
import POS1Land.Calc.Euro2Yen;
import POS1Land.Calc.WR;

public class ChainManager {

    public static WR getChainOfCalculators() {
        WR euro2dollar = new Euro2Dollar();
        WR euro2yen = new Euro2Yen();

        euro2dollar.setNextCalc(euro2yen);

        return euro2dollar;
    }
}
