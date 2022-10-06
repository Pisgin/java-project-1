package Day_36_Inharatance.Phone;

public class Samsung extends Phone{

    public Samsung (String brand, String model, int size, double price, String color){
        super("Samsung" , model, 6 , price, color);
    }
    public  void freeze(){
        System.out.println("only freeze is a samsung");
    }
}
