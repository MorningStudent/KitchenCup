package kitchen;

import world.Liquid;

public class SmallCup extends Cup {

    public final short  MAX_VOLUME = 250;

    public void setLiquid(Liquid liquid) {
        if ( liquid.getVolume() <= MAX_VOLUME) {
            super.setLiquid(liquid);
        } else {
            System.out.println("The object of type \"SmallCup\" can have max 250 ml volume. Please set less!");
        }
    }
}
