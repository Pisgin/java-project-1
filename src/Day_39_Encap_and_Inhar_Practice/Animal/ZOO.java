package Day_39_Encap_and_Inhar_Practice.Animal;

import Day_38_Inharatance_Overriding.Car.Car;

public class ZOO {

    public static void main(String[] args) {

        Bear bear = new Bear("Boz" ,'M' , 1 ,"Huge" , "Black" , true , false ,false);
        bear.getName();
        bear.eat();
        bear.drink();
        bear.move();
        bear.hunt();
        bear.sleep();
        bear.getBreed();
        System.out.println("------------------------------------------------");

        Cat cat = new Cat("Van" ,'F' , 3 , "Baby" , "White", false, true,true );
        cat.meow();
        cat.scratch();
        System.out.println( cat.getAge() );
        cat.setAge(1);
        System.out.println( cat.getAge() );
        cat.eat();
        cat.drink();
        cat.move();
        cat.sleep();
        System.out.println("----------------------------------------------");

        Dog dog = new Dog("German" , 'M' , 4 , "Large" , "White - Black" , false,true,true);

        dog.bark();
        dog.eat();
        dog.eat();
        dog.move();
        dog.sleep();
        System.out.println("-----------------------------------------------");
    }
}
