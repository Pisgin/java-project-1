package Day_38_Inharatance_Overriding.Animal;

public class Eagle extends  Animal {

    public Eagle(String breed, String color, String size, int age, char gender) {
        super("Eagle", breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a rabbit and snake");
    }
}
