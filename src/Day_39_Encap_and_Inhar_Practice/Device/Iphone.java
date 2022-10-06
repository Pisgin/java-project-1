package Day_39_Encap_and_Inhar_Practice.Device;

public class Iphone extends Phone {

    public Iphone(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Iphone", model, price, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void call(long call) {
        super.call(call);
    }

    @Override
    public void text(long text) {
        super.text(text);
    }

}
