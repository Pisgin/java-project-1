package Day_32_Contructor;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car("Toyata");
        Car car2 = new Car ("Toyata" , "Civic");
        Car car3 = new Car ("Honda" , "City" , 2019);
        Car car4 = new Car ("Wolksvagen" , "Golf" , 2018);
        Car car5 = new Car ("Dacia" , "Dokker" , 2018, 50000);

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);


    }
}
