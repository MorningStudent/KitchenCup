package world;

public class Liquid {
    
    private String name;
    private int    volume;           // ml
    private byte   temperature;      // Celsius

    public Liquid () {

    }

    public Liquid (String name, int volume, byte temperature) {      //Polymorphism
        setName(name);
        setVolume(volume);
        setTemperature(temperature);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( !name.isBlank() && !name.equals("null") ) {
            this.name = name;
        } else {
            System.out.println("Cannot set a whitespace or the \"null\"-string as a name. Try again!");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if ( volume > 0 ) {
            this.volume = volume;
        } else {
            System.out.println("Cannot set a negative or 0 ml. Try again!");
        }
    }

    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        if ( temperature >= 0 && temperature <= 100 )
        this.temperature = temperature;
    }

    public boolean isCold() {
        boolean a = false;
        if  (getTemperature() <= (byte)18 ) {
        a = true;
        }
        return a;
    }

    public boolean isWarm() {
        boolean a = false;
        if ( getTemperature() > (byte)18 && getTemperature() <= (byte)36 ) {
        a = true;
        }
        return a;
    }

    public boolean isHot() {
        boolean a = false;
        if ( getTemperature() > (byte)36 ) {
        a = true;
        }
        return a;
    }

    public String stringVolume () {
        String outVolume = String.format("%-4s", volume) + " ml of";
        return outVolume;
    }

    public String stringName () {
        String outName   = String.format("%-5s", name);
        return outName;
    }

    public String toString() {
        return stringVolume() + " " + stringName ();
    }

}
