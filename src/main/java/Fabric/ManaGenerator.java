package Fabric;

import Interface.iGameItem;
import Product.Mana;

public class ManaGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Mana();
    }
}
