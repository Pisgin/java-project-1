package Day_38_Inharatance_Overriding.Shape;

public class Rectangle extends Shape{

    public int l ;
    public int w;

    public Rectangle(String name, int l, int w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    @Override
    public double area() {
        return l * w;
    }

    @Override
    public double perimeter() {
        return 2 * ( l + w );
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "l=" + l +
                ", w=" + w +
                ", name='" + name + '\'' +
                " area = " + area() + '\"' +
                " perimeter = " + perimeter() +
                '}';
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
}
