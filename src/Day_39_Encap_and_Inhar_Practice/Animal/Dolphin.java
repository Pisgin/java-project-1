package Day_39_Encap_and_Inhar_Practice.Animal;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Dolphin", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void swim() {
        System.out.println( "Every " + getName() + "s are swimming ");
    }
}
