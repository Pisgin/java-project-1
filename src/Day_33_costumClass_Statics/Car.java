package Day_33_costumClass_Statics;

public class Car {
    public String make , model , color ;
    public  int year;
    public double price ;

    public  Car( String  make){
        this.make = make;
    }
    public Car (String make , String model){
        this(make);
        this.model = model;
    }

    public Car (String make ,String model , int year){
        this(make ,model);
        this.year = year;
    }
    public  Car(String make ,String model , int year , double price){
        this(make , model , year);
        this.price = price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

class CarObjects{
    public static void main(String[] args) {

        Day_32_Contructor.Car car1 = new Day_32_Contructor.Car("Toyata");
        Day_32_Contructor.Car car2 = new Day_32_Contructor.Car("Toyata" , "Civic");
        Day_32_Contructor.Car car3 = new Day_32_Contructor.Car("Honda" , "City" , 2019);
        Day_32_Contructor.Car car4 = new Day_32_Contructor.Car("Wolksvagen" , "Golf" , 2018);
        Day_32_Contructor.Car car5 = new Day_32_Contructor.Car("Dacia" , "Dokker" , 2018, 50000);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);


    }

}
