package Day_39_Encap_and_Inhar_Practice.Device;

public class PersonalComputer extends Computer{

    public PersonalComputer(double price, boolean hasBattery, boolean hasPowerButton) {
        super("PersonalComputer", price, hasBattery, hasPowerButton);
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
