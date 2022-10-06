package Day_35_Encapsulation;

public class Carpet {
    private  int  width;
    private  int length ;
    private  double unitPrice;
    private boolean isPersian;

    public  Carpet(){

    }

    public Carpet( int width, int length, double unitPrice, boolean isPersian ) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

        if ( length <= 0 || width <= 0 || unitPrice <= 0 ){
            System.err.println("Invalid values");
            System.exit(0);

        }
    }

    public Carpet( int width, int length, double unitPrice ) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;

        if ( length <= 0 || width <= 0 || unitPrice <= 0 ){
            System.err.println("Invalid values");
            System.exit(0);

        }

    }

    public double callCost(){
        double total = 0;

        if (isPersian)
            total =  ( width * length ) * unitPrice + 200;
        else
            total =  ( width * length ) * unitPrice;

        return total;
    }
    /*
       public double callCost1(){
        double total =  ( width * length ) * unitPrice + 200;
        return total;
    }

     */

    public String toString() {
        return "Carpet{" +
                "width = " + width +
                ", length = " + length +
                ", unitPrice = " + unitPrice +
                ", isPersian =  " + isPersian +
                ", total = " + callCost() +
                 '}';
    }
}
