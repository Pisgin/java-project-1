package Day_38_Inharatance_Overriding.Animal;

public class Dog extends Animal {

    public Dog(String breed, String color, String size, int age, char gender) {
        super("Dog", breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meals or dog food");
    }
}
