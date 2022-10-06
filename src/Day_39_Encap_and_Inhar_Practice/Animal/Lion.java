package Day_39_Encap_and_Inhar_Practice.Animal;

public class Lion extends WildAnimal{

    public Lion(String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super("Lion", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println( getName() + " is hunting anthilope" );
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking water");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping every night");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving every day ");
    }
}
