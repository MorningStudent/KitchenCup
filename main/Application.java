package main;

import kitchen.Cup;
import kitchen.SmallCup;
import kitchen.BigCup;
import world.Liquid;

public class Application {
    public static void main(String[] args) {
        
        Liquid liqB = new Liquid("Milk", 200, (byte)30);

        Cup smallCupA = new SmallCup();

        smallCupA.setLiquid(liqB);
        smallCupA.addVolumeInCup(50);

        System.out.println(smallCupA);

    }
}
