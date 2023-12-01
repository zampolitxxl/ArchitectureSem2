package Fabric;

import Interface.iGameItem;
import Product.Health;

public class HealthGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Health();
    }
}
