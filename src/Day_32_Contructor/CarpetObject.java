package Day_32_Contructor;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(150 ,50,100,true);


        System.out.println(" price : " + carpet1.calcCost());

        System.out.println(carpet1);
    }
}
