package Day_38_Inharatance_Overriding.Car;

public class Toyota extends  Car{

    public Toyota( String model, int year, String color, int miles) {
        super("Toyota", model, year, color, miles);
    }

    public  void reliable () {
        System.out.println(brand + "  is best reliable car ");
    }

    public void start(){
        System.out.println(brand + " " + model + " twist  a key to Ignation");
    }
}
