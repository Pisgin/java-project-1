package Day_36_Inharatance.Phone;

public class Iphone extends  Phone {

    public Iphone(String brand, String model, int size, double price, String color){
        super("Apple", model, 5 , price, color);
    }
    public  void  faceTime( long phoneNumber ){
        System.out.println("only face to face is a Iphone");
    }

    public void faceTime(String email){
        System.out.println("my email adress is : " + email );

    }
}
