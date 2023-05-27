package main;

import kitchen.Cup;

public class Application {
    public static void main(String[] args) {
        
        Cup cupA = new Cup("Milk", (short)300);
        Cup cupB = new Cup("Water", (short)500);

        cupA.setLiquidVolume((short) (cupA.getLiquidVolume() - (short)50));
        cupB.setLiquidVolume((short) (cupB.getLiquidVolume() + (short)50));

        System.out.println("cupA contains: \n" + cupA);
        System.out.println("cupB contains: \n" + cupB);

    }
}
