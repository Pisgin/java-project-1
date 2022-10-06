package Day_39_Encap_and_Inhar_Practice.Device;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void  call ( long call ) {
        System.out.println(getBrand() + " " + getModel() + " " + call + " is calling");
    }

    public void text ( long text ) {
        System.out.println( getBrand() + " " + getModel() + " " + text + " is text");
    }
}
