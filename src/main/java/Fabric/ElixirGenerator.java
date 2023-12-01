package Fabric;

import Interface.iGameItem;
import Product.Elixir;

public class ElixirGenerator extends  ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new Elixir();
    }
}
