package main;

import kitchen.Cup;
import kitchen.SmallCup;
import kitchen.BigCup;
import world.Liquid;

public class Application {
    public static void main(String[] args) {
        
        Liquid liqB = new Liquid("Milk", 500, (byte)30);

        Cup standardCup = new Cup();

        standardCup.setLiquid(liqB);
        liqB.setVolume( liqB.getVolume() + 50 );

        System.out.println(standardCup);

    }
}
