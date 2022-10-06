package Day_35_Encapsulation;

public class Square {

    private int side;
    public int ss;



    public Square(int side) {
        this.side = side;

        if( side <= 0){
            System.out.println(" Invalid side = " + side);
            System.exit(0);
        }
    }

    public int calcArea (){
        return side * side ;
    }
    public  int calsPerimeter(){
        return side * 4;

    }

    public String toString() {
        return "Square{" +
                " side = " + side +
                " area = " + calcArea() +
                " perimeter = " + calsPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Square aa = new Square(4);

        System.out.println(" peri : " + aa.calsPerimeter() + " area : " + aa.calcArea()  );

        Square bb = new Square(-2);
        System.out.println(" peri : " + bb.calsPerimeter() + " area : " + bb.calcArea() );
    }
    }



