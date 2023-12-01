package org.example;

import Fabric.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<ItemGenerator> generators = new ArrayList<>();

        //Добавим элементы в список в разном количестве чтобы добиться нужного соотношения при генерации

        //3 золота
        generators.add(new GoldGenerator());
        generators.add(new GoldGenerator());
        generators.add(new GoldGenerator());


        //1 GEM
        generators.add(new GemGenerator());
        //10 Elixir
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());
        generators.add(new ElixirGenerator());

        //10 Silver
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        generators.add(new SilverGenerator());
        //10 MANA
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
        generators.add(new ManaGenerator());
//10 Health
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
        generators.add(new HealthGenerator());
//10 WEAPONS

        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());
        generators.add(new WeaponsGenerator());






        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);

            int index = random.nextInt(53);

            generators.get(index).openReward();
            //System.out.println("Индекс" + index);



        }

        }
    }
