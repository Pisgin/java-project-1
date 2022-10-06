package Day_35_Encapsulation;

public class Circle {

    private int radius ;

    public static double pi;

    static {
        pi = 3.14;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if ( radius <= 0 ){
            System.out.println("Invalid radius values. enter again : ");
            return;
            //System.exit(0);

        }else
            this.radius = radius;
    }

    public double calcArea (){
        double result = pi * radius * radius;
        return result;
    }
    public double calcPerimeter(){
        double result = 2 * pi * radius;
        return  result;
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                " area = " + calcArea() +
                " perimeter = " + calcPerimeter() +
                '}';
    }

    public Circle( int radius ) {
        if ( radius <= 0 ){
            System.out.println("Invalid radius values. enter again : ");
            return;
            //System.exit(0);

        }else
             this.radius = radius;
    }
    public Circle(){}
}
