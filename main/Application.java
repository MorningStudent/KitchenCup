package main;

import kitchen.Cup;
import kitchen.SmallCup;
import kitchen.BigCup;
import world.Liquid;

public class Application {
    public static void main(String[] args) {
        
        //Cup cupA = new Cup("Milk", (short)300);
        //Cup cupB = new Cup("Water", (short)500);

        //cupA.setLiquidVolume((short) (cupA.getLiquidVolume() - (short)50));
        //cupB.setLiquidVolume((short) (cupB.getLiquidVolume() + (short)50));

        //Cup smallCupA = new SmallCup("Tea", (short)200);
        //System.out.println("smallcupA contains: \n" + smallCupA);


        //Cup bigCupA = new BigCup("Water", (short)200);

        //bigCupA.setLiquidVolume((short) (bigCupA.getLiquidVolume() + cupB.getLiquidVolume()));
        //cupB.setLiquidVolume   ((short) (cupB.getLiquidVolume() - cupB.getLiquidVolume()));

        //System.out.println("bigCupA contains: \n" + bigCupA);
        //System.out.println("cupB contains: \n" + cupB);

        Liquid liqA = new Liquid("Water", 150, (byte)18);
        Liquid liqB = new Liquid("Milk", 200, (byte)30);
        Liquid liqC = new Liquid("Tea", 300, (byte)46);

        System.out.println(liqA);
        System.out.println(liqB);
        System.out.println(liqC);


    }
}
