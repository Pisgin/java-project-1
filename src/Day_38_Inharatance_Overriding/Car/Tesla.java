package Day_38_Inharatance_Overriding.Car;

public class Tesla extends Car{

    public Tesla(String model, int year, String color, int miles) {
        super("Tesla", model, year, color, miles);
    }

    public void autopilot() {
        System.out.println(brand + " have a autopilot. there isn't a driver" );
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " just call 'Start' ");
    }
}
