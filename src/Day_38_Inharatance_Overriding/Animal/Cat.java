package Day_38_Inharatance_Overriding.Animal;

public class Cat extends Animal {

    public Cat(String breed, String color, String size, int age, char gender) {
        super("Cat", breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating mouse or cat food ");
    }
}
