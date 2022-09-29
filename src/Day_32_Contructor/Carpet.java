package Day_32_Contructor;

public class Carpet {
    int width;
    int length;
    double unitPrice;
    boolean isPersian;

    double calcCost(){

        double totalprice = (width*length) *unitPrice;

        if (isPersian== true)
            totalprice = totalprice + 200;

        return  totalprice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                "total price=$" + calcCost() +
                '}';
    }

    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
}
