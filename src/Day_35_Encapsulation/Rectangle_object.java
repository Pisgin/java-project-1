package Day_35_Encapsulation;

public class Rectangle_object {
    public static void main(String[] args) {
        Rectangle rc1 = new Rectangle(4,5);

        int peri = rc1.calcPerimeter();
        int area = rc1.calcArea();

        System.out.println("rc1 = " + rc1);

    }
}
