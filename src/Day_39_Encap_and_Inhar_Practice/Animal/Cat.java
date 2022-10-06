package Day_39_Encap_and_Inhar_Practice.Animal;

public class Cat extends FriendlyAnimal{

    public Cat(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Cat", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void scratch(){
        System.out.println(getName() + " is scratch");
    }

    public void meow() {
        System.out.println("Every " + getName() + "s are meow");
    }
}
