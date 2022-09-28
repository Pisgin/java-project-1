package Day_30_Custom_Class_Intro;

public class Dog_Object {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender= 'F';
        dog1.size ="Small";
        dog1.color = "White";
        System.out.println("dog1 = " + dog1);

        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender= 'M';
        dog2.size ="Large";
        dog2.color = "White & Black";

        System.out.println("dog2 = " + dog2);

        dog3.setInfo("Jack" , "German Sharp" , 4 ,'M' , "Yellow" , "Medium");

        System.out.println("dog3 = " + dog3);
        System.out.println("----------------------------------------------------------------");

        dog1.eat();

        dog2.drink();

        dog3.bark();




    }
}
