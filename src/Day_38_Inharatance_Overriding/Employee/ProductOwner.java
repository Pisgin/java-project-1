package Day_38_Inharatance_Overriding.Employee;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        super(name, "PO", age, ID, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println(name + " is a PO");
    }
}
