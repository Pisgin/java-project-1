package Day_33_costumClass_Statics;

public class New_Car {

    public  String make ;
    public String model   , color;
    public int year;
    public double price;

    public static int numberOfWheels;
    public static boolean hasBattery;
    public static boolean hasSeats;

    public New_Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "New_Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void drive(){

        System.out.println("car brand : " + make);


    }


    /*

            Car Task:
1. Create a class called Car
        Attributes:
                  instance: make, model, color, year, price
                 static: numberOfWheels, hasBattery, hasSeats
        Add a constructor to initialize all the fields
         Methods:
                drive()
                toString()

     */
}
