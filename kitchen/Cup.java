package kitchen;

public class Cup {
    private String liquidName;
    private short  liquidVolume;
    private short  maxVolume = 600;

    public Cup () {}

    public Cup (String liquidName, short  liquidVolume) {
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
    }

    public String getLiquidName() {
        return liquidName;
    }

    public void setLiquidName(String liquidName) {
        if ( liquidName.equals("Water") || liquidName.equals("Milk") || liquidName.equals("Tea") ) {
        this.liquidName = liquidName;
        } else {
            System.out.println("You can choose betwwen Water / Milk / Tea. Try again!");
        }
    }

    public short getLiquidVolume() {
        return liquidVolume;
    }

    public void setLiquidVolume(short liquidVolume) {
        if ( liquidVolume >= 0 && liquidVolume <= getMaxVolume() ) {
        this.liquidVolume = liquidVolume;
        } else {
            System.out.println("Maximum " + getMaxVolume() + " ml units available. Try again!");
        }
    }

    public short getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(short maxVolume) {
        this.maxVolume = maxVolume;
    }

    public String toString() {

        String out = 
        "+~~~~~~~~~~~~~~~~~+  \n" +
        " \\   " + String.format("%-3s", liquidVolume) + " ml of   /  \n" +
        "  \\     " + String.format("%-5s", liquidName)+ "   /   \n" +
        "   \\           /    \n" +
        "    \\_________/     \n" ;;

        return out;
    }

}