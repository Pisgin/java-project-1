package Day_33_costumClass_Statics;

import org.w3c.dom.ls.LSOutput;

public class DogObject {
    public static void main(String[] args) {


        Dog dog1 = new Dog("karabas", "medium", 'M', 4, "black-white");

        System.out.println(dog1);
        dog1.eat();
    }
}