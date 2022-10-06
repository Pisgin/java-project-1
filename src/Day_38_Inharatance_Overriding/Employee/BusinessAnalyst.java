package Day_38_Inharatance_Overriding.Employee;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        super(name,"BO", age, ID, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name + " is a BO");
    }
}
