package Day_39_Encap_and_Inhar_Practice.Animal;

public class Dog extends  FriendlyAnimal{

    public Dog(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dog", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void bark() {
        System.out.println(getName() + " is barking always");
    }
}
