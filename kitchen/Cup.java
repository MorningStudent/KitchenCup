package kitchen;

import world.Liquid;

public class Cup {
    private Liquid liquid;
    public final short  MAX_VOLUME = 600;
    public final String  CLASS_NAME = "\"Cup\"";

    public Cup () {

    }

    public short getMaxVolume() {
        return MAX_VOLUME;
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        if ( liquid.getVolume() <= getMaxVolume()) {
            this.liquid = liquid;
        } else {
            System.out.println("The object of type " + getClassName() + " can have max " + getMaxVolume() + " ml volume. Please set less!");
        }
    }

    public void addVolumeInCup(int addVolume) {
        if (liquid.getVolume() < getMaxVolume() && addVolume <= (getMaxVolume() - liquid.getVolume())) {
            liquid.setVolume(liquid.getVolume() + addVolume);
        }
    }

    public String toString() {
        String liquidStringVolume;
        String liquidStringName;
        if (this.liquid == null) {
            liquidStringVolume = "   empty  ";
            liquidStringName   = "     ";
        } else {
            liquidStringVolume = liquid.stringVolume();
            liquidStringName   = liquid.stringName();
        }
        String out =
        "+-----------------+  \n" +
        " \\   " + liquidStringVolume + "  /  \n" +
        "  \\    " + liquidStringName + "    /   \n" +
        "   \\           /    \n" +
        "    \\_________/     \n" ;

        return out;
    }
}