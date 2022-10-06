package Day_38_Inharatance_Overriding.Employee;

public class Developer extends Employee {

    public Developer(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        super(name, "Developer", age, ID, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name + " is a developer");
    }
}
