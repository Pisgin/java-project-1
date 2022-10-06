package Day_39_Encap_and_Inhar_Practice.Device;

public class Computer extends Device{

    public Computer(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Computer", model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getModel( )  + " is turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getModel( )  + " is turnOff");
    }
}
