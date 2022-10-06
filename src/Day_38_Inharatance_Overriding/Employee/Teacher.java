package Day_38_Inharatance_Overriding.Employee;

public class Teacher extends Employee{

    public Teacher(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        super(name, "Teacher", age, ID, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name + " is a teacher");
    }
}
