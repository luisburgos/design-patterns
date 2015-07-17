package abstractfactory.examples.kingdom.factories;

import abstractfactory.examples.kingdom.parts.*;

/**
 * Created by luisburgos on 17/07/15.
 */
public class MenKingdomFactory extends KingdomFactory {
    @Override
    public Castle makeCastle() {
        return new MenCastle();
    }

    @Override
    public King makeKing() {
        return new MenKing();
    }

    @Override
    public Army makeArmy() {
        return new MenArmy();
    }
}
