package Day_38_Inharatance_Overriding.Shape;

public class Shape_Object {

    public static void main(String[] args) {

        Square square1 = new Square("Square_1" ,10);

        System.out.println("square1 = " + square1);


        Rectangle rectangle1 = new Rectangle("Rectangle1" , 12 ,5);

        System.out.println("rectangle1 = " + rectangle1);

        System.out.println("-----------------------------------------");

        rectangle1.getL();
        rectangle1.setL(15);

        System.out.println("rectangle1 = " + rectangle1);

        System.out.println("-----------------------------------------");

        Circle circle1 = new Circle("Circle1" , 8);

        System.out.println("circle1 = " + circle1);

        System.out.println("-----------------------------------------");

        System.out.println("circle1 area : " + circle1.area() );
        System.out.println("rectangle1 area : " + rectangle1.area() );
        System.out.println("square1 area : " + square1.area() );

        System.out.println("---------------------------------------------");

        square1.setS(15);

        System.out.println( "new square1 area : " + square1.area() );

        System.out.println("-----------------------------------------");


    }
}
