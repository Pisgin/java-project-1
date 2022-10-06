package Day_38_Inharatance_Overriding.Employee;

import Day_38_Inharatance_Overriding.Animal.Eagle;

public class Tester extends Employee {

    public Tester(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        super(name, "QA", age, ID, gender, salaryName);
    }

    @Override
    public void work() {
        System.out.println( name + " is a tester");
    }
}
