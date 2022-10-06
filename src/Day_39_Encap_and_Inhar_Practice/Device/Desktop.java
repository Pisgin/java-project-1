package Day_39_Encap_and_Inhar_Practice.Device;

public class Desktop extends Computer{

    public Desktop ( double price, boolean hasBattery, boolean hasPowerButton) {
        super("Desktop", price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }
}
