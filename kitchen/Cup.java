package kitchen;

import world.Liquid;

public class Cup {
    private Liquid liquid;
    public final short  MAX_VOLUME = 600;

    public Cup () {

    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        if ( liquid.getVolume() <= MAX_VOLUME) {
            this.liquid = liquid;
        } else {
            System.out.println("The object of type \"Cup\" can have max 600 ml volume. Please set less!");
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