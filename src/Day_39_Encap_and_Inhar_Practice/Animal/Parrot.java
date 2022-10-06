package Day_39_Encap_and_Inhar_Practice.Animal;

public class Parrot extends FriendlyAnimal{

    public Parrot(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Parrot", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public  void  fly() {
        System.out.println(getName() + " is flying");
    }

    public void  sing () {
        System.out.println(getName() + " is singing");
    }
}
