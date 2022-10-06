package Day_36_Inharatance.Phone;

public class Phone {

    public String brand;
    public  String model;
    public int size;
    public double price;
    public String color;

   public  Phone() {}

    public Phone(String brand, String model, int size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0 )
            System.out.println("Invalid price value");
        else
            this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInfo(){
        System.out.println("My Phone is " + brand + " and "+ model);

    }

    public void call( long phoneNumber) {
        System.out.println("my phone number is " + phoneNumber);
    }

    public void text ( long phoneNumber ){
        System.out.println("this is a text number : " + phoneNumber);

    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    /*
    1. Phone Task:
1.1 Create a class named Phone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
toString()
1.2 Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString()
1.3 Create a sub class of Phone named Samsung:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
freeze()
toString()
1.4 Create a sub class of Phone named Nokia:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
selfDefense()
toString()
1.5 Create a class named Phone Objects and test of the
sub class' objects
     */
}
