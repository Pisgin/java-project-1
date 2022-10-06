package Day_39_Encap_and_Inhar_Practice.Animal;

public class FriendlyAnimal extends Animal {
    public  boolean isWild , isFriendly ;
    public boolean isPlayable;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void play() {
        System.out.println( getName() + " is playing");
    }

    public void pet() {
        System.out.println(getName() + " is a pet");
    }

    /*
            Create a sub class of Animal named FriendlyAnimal:
Variable:
isWild
isFriendly
isPlayable
Extra methods:
play()
pet()
     */
}
