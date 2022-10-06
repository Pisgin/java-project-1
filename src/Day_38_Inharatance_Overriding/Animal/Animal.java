package Day_38_Inharatance_Overriding.Animal;

public class Animal {


    public String name , breed , color , size ;
    public int age ;
    public  char gender;

    public Animal (String name, String breed, String color, String size, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    public void eat () {
        System.out.println( name + " is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /*
                 Create a class named Animal:
Variables:
name, breed, age, gender, size, color
Add a constructor to set all the fields
methods:
eat()
toString()
     */
}
