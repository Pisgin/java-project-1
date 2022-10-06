package Day_38_Inharatance_Overriding.Animal;

public class Tiger extends  Animal {

    public Tiger(String breed, String color, String size, int age, char gender) {
        super("Tiger", breed, color, size, age, gender);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating anthilop or deer");
    }
}
