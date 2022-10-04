package Day_33_costumClass_Statics;

public class Dog {
    /*
            Dog Task:
1. Create a class called Dog
            Attributes:
            instance: breed, size, gender,
age, color
            statics: numberOfLegs,
numberOfEyes, numberOfWings, isFriendly
            Add a constructor to initialized all the
fields (instances)
            Methods:
            eat()
            sleep()
            play()
                toString()
     */

    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public  void  eat(){

        System.out.println("dogs is eating");
    }
    public void sleep(){

        System.out.println("all dogs ar sleeping");
    }
    public void play(){

        System.out.println("every baby dogs like playing");
    }
}
