package Day_39_Encap_and_Inhar_Practice.Animal;

public class Eagle extends WildAnimal {

    public Eagle ( String breed, char gender, int age, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable ) {
        super("Eagle", breed, gender, age, size, color, isWild, isFriendly, isPlayable);
    }

    public void hunt() {
        System.out.println( getName() + " is hunting mouse or rabbit" );
    }

    @Override
    public void eat() {
        System.out.println(getName() +" is eating  once a day") ;
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

