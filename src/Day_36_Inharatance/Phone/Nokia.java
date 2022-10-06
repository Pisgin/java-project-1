package Day_36_Inharatance.Phone;

public class Nokia extends Phone{

    public Nokia(String brand, String model, int size, double price, String color){
        super("Nokia" , model, 4 , price, color);
    }
    public void selfDefence(){
        System.out.println("only self defence is nokia");
    }
}
