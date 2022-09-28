package Day_30_Custom_Class_Intro;

import java.security.PublicKey;

public class CaR {

    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        color = carColor;
        price = carPrice;
    }

    public String toString() {
        return "CaR{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
