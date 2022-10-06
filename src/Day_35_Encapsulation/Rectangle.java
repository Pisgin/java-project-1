package Day_35_Encapsulation;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;

        if (length <= 0 || width <= 0){
            System.err.println("Invalid values : " + length + " and " + width);
            System.exit(0);
        }
    }


    public int calcArea(){
        return length * width;
    }
    public int calcPerimeter(){
        return 2 * ( width + length );
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area = " + calcArea() +
                ", perimeter = " + calcPerimeter() +
                '}';
    }
}
