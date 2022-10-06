package Day_38_Inharatance_Overriding.Shape;

public class Circle extends Shape{

    public int r;
    public static  double pi ;

    static {
        pi = 3.14;
    }

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    @Override
    public double area() {
        return pi * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * pi * r ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", name='" + name + '\'' +
                " area = " + area() + '\"' +
                " perimeter = " + perimeter() +
                '}';
    }
}
