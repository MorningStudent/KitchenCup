package kitchen;

public class BigCup extends Cup {

    
    public BigCup (String liquidName, short  liquidVolume) {
        super(liquidName, liquidVolume);
    }

    @Override
    public void setLiquidVolume(short liquidVolume) {
        super.setMaxVolume((short)1000);
        if ( liquidVolume >= 0 && liquidVolume <= getMaxVolume()) {
        super.setLiquidVolume(liquidVolume);
        } else {
            System.out.println("Maximum " + getMaxVolume() + " ml units available. Try again!");
        }
        super.setMaxVolume((short)600);
    }
}
