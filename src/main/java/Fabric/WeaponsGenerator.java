package Fabric;

import Interface.iGameItem;
import Product.Weapons;

public class WeaponsGenerator extends  ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Weapons();
    }
}
