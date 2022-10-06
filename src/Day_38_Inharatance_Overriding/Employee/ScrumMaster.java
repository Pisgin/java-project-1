package Day_38_Inharatance_Overriding.Employee;

public class ScrumMaster extends Employee {

    public ScrumMaster(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        super(name, "SM", age, ID, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name + " is a SM");
    }
}
