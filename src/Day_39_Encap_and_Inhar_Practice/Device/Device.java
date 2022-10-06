package Day_39_Encap_and_Inhar_Practice.Device;

public class Device {

    private String brand , model ;
    private double price ;
    private static  boolean hasBattery , hasPowerButton;

    static {
        hasBattery = true;
        hasPowerButton = true ;
    }

    public Device (String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
       setBrand(brand);
       setModel(model);
        setPrice(price);
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isBlank() || brand.isEmpty() || brand == null ){
            System.out.println("Invalid Brand value");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.isBlank() || model == null ){
            System.out.println("Invalid Model value");
            System.exit(1);
        }
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.out.println("Invalid Price value");
            System.exit(1);
        }
        this.price = price;
    }

    public void turnOn() {
        System.out.println(brand + " " + model + " is turnOn");
    }

    public void turnOff() {
        System.out.println(brand + " " + model + " is turnOff");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }

    /*
            Variables:
brand, model, price,
hasBattery, hasPowerButton
Encapsulate all the fields
Add a constructor to set all the fields
Condition:
1. brand,
model can not be null (if obj == null means it's error)
2. brand,
model can not be empty or can not be blank
3. price
can not be set to negative or zero
Methods:
turnOn(), turnOff(), toString()
     */
}
