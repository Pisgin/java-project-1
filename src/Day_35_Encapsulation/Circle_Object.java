package Day_35_Encapsulation;

public class Circle_Object {
    public static void main(String[] args) {

        Circle c1 = new Circle(15);
        System.out.println(c1);

        System.out.println("------------------------------------------");

        Circle c2 = new Circle(-10);
        System.out.println(c2);
        System.out.println("-------------------------------------------");

        Circle c3 = new Circle();
        c3.setRadius(-12);
        System.out.println("c3 = " + c3);


    }
}
