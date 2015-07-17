package abstractfactory.examples.kingdom.factories;

import abstractfactory.examples.kingdom.parts.*;

/**
 * Created by luisburgos on 17/07/15.
 */
public class ElfKingdomFactory extends KingdomFactory {
    @Override
    public Castle makeCastle() {
        return new ElfCastle();
    }

    @Override
    public King makeKing() {
        return new ElfKing();
    }

    @Override
    public Army makeArmy() {
        return new ElfArmy();
    }
}
