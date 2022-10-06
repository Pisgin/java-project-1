package Day_36_Inharatance.Phone;

public class Phone_object {
    public static void main(String[] args) {


        Iphone Ip1 = new Iphone("Apple" , "SE ", 5 , 14000 , "red");
        Ip1.brand = "Iphone SE";
        Ip1.model = "Iphone 13 pro Max";
        Ip1.color = "White";
        Ip1.price = 13000;
        Ip1.size = 10;

        System.out.println(Ip1);

        Ip1.setInfo();
        Ip1.faceTime("arsenalkartal@gmail.com");
        Ip1.call(545314318);
        System.out.println("-------------------------------------------");

        Iphone Ip2 = new Iphone("Apple" ,"12 pro" ,5 , 15000 , "yellow");

        System.out.println("Ip2 = " + Ip2);

        System.out.println("---------------------------------------------");

        Samsung s1 = new Samsung("Samsung" , "a52" , 6 , 9000 , "White");

        s1.brand = "Samsung";
        s1.model = "A70";
        s1.size = 9 ;
        s1.price = 11000;
        s1.color = "Blue";

        System.out.println("s1 = " + s1);

        s1.freeze();
        s1.setInfo();
        s1.getPrice();
        System.out.println("--------------------------------------------");

        Nokia N1 = new Nokia("Nokia" , "3110" , 4 , 5500 , "Black");
        N1.brand = "Nokia";
        N1.model = "3310 Classics";
        N1.color = "Black";

        N1.setInfo();
        N1.selfDefence();
    }
}