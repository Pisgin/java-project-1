package Day_32_Contructor;

public class ConstructorCall {

    public  ConstructorCall(){
        System.out.println("Default Constructor");
    }

    public ConstructorCall ( int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public  ConstructorCall ( String str){
        // this();
        this(10);
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {

        ConstructorCall cons1 = new ConstructorCall();
        System.out.println("---------------------------------------------------");

        ConstructorCall cons2 = new ConstructorCall(10);
        System.out.println("---------------------------------------------------");

        ConstructorCall cons3 = new ConstructorCall("java");
        System.out.println("---------------------------------------------------");
    }
}
