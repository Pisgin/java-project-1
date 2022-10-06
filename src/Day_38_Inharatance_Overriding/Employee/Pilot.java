package Day_38_Inharatance_Overriding.Employee;

public class Pilot {
    public  String name;
    public int age;
    public char gender;

    public Pilot(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name + " is a pilot");
    }
}
