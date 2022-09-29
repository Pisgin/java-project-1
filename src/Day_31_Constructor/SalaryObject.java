package Day_31_Constructor;

public class SalaryObject {
    public static void main(String[] args) {

        Salary salary1 = new Salary(10,6,550,1250);
        Salary salary2 = new Salary(8,5,1200,600);

        salary1.salary();

        salary2.salary();

        salary1.salaryAfterTax();

        salary2.salaryAfterTax();



    }
}
