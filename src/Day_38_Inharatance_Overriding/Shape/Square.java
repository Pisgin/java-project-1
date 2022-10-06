package Day_38_Inharatance_Overriding.Shape;

public class Square extends Shape{

    public int s;

    public Square(String name, int s) {
        super(name);
        this.s = s;
    }

    @Override
    public double area() {
        return s * s;
    }

    @Override
    public double perimeter() {
        return s * 4 ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                ", name='" + name + '\'' +
                " area = " + area() + '\"' +
                " perimeter = " + perimeter() +
                '}';
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}
