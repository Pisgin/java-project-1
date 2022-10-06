package Day_35_Encapsulation;

public class Carpet_Object {
    public static void main(String[] args) {
        Carpet cr1 = new Carpet(12,20,15,true);

        Carpet cr2 = new Carpet(12,20,15 , false);

       //  Carpet cr3 = new Carpet(10, 50 , -100 ,  true); // negative values

        System.out.println("cr1 = " + cr1);
        System.out.println("cr2 = " + cr2);
    }
}
