package Day_38_Inharatance_Overriding.Car;

public class BMW  extends Car {

    public BMW( String model, int year, String color, int miles) {
        super("BMW", model, year, color, miles);
    }

    public void  breakDown () {
        System.out.println(brand + " is never breakdown");
    }

    public  void  racing () {
        System.out.println(brand + " is  best racing car");
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " call mechanic . Jump Start");
    }
}
