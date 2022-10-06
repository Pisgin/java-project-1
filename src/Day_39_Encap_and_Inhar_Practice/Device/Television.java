package Day_39_Encap_and_Inhar_Practice.Device;

public class Television extends Device{

    public Television(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(" Television", model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel( )  + " is turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel( )  + " is turnOff");
    }

    public void channelUp () {
        System.out.println("Channel Up to 1 , 2 , 3 , 4 , .....");
    }

    public void channelDown () {
        System.out.println("Channel down to 10 , 9 , 8 , 7 , .....");
    }
}
