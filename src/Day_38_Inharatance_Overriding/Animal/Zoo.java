package Day_38_Inharatance_Overriding.Animal;

public class Zoo {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tekir" , "White - Black - Brown" , "medium" , 3 , 'M');

        Dog dog1 = new Dog("Bulldog" , "Black" , "Large" , 5 , 'F') ;

        Tiger tiger1 = new Tiger("Sibirya" , "White" , "huge" , 2 , 'M');

        Eagle eagle1 = new Eagle("Anatolian" , "White -Black" , "baby" , 1 , 'F');

        System.out.println();
        cat1.eat();
        System.out.println();
        dog1.eat();
        System.out.println();
        tiger1.eat();
        System.out.println();
        eagle1.eat();
        System.out.println();
        System.out.println("---------------------------------");
    }
}
