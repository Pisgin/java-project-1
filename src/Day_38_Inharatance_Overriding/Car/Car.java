package Day_38_Inharatance_Overriding.Car;

public class Car {
     public  String  brand ;
     public  String model ;
     public  int year;
     public String color;
      public int miles;

    public Car(String brand, String model, int year, String color, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.miles = miles;
    }

    public void start () {
        System.out.println( brand + " " + model + " is starting for drive race");
    }

    public  void  drive () {
        System.out.println( model + " is driving from driver");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
