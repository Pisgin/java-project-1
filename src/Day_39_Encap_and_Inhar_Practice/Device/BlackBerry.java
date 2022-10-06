package Day_39_Encap_and_Inhar_Practice.Device;

public class BlackBerry extends Phone{

    public BlackBerry(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("BlackBerry", model, price, hasBattery, hasPowerButton);
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
