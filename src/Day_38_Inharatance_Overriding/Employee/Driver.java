package Day_38_Inharatance_Overriding.Employee;

public class Driver {
    public String name;
    public String breed , model ;
    public int age;

    public Driver(String name, String breed, String model, int age) {
        this.name = name;
        this.breed = breed;
        this.model = model;
        this.age = age;
    }

    public void work (){
        System.out.println(name + " is a driver");
    }
}
