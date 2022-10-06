package Day_39_Encap_and_Inhar_Practice.Animal;

public class WildAnimal extends Animal{

    public  boolean isWild , isFriendly ;
    public boolean isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void hunt() {
        System.out.println(getName() + " is a hunting Animal");
    }

    /*
            Create a sub class of Animal named WildAnimal:
Variable:
isWild,
isFriendly, isPlayable
Extra Methods:
hunt()
     */
}
