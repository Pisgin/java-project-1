package Day_31_Constructor;

public class Salary {

    public int hourlyRate  , weeklyRate;
    public double state_TaxRate , federal_TaxRate;

    public Salary(int hourlyRate, int weeklyRate, double state_TaxRate, double federal_TaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyRate = weeklyRate;
        this.state_TaxRate = state_TaxRate;
        this.federal_TaxRate = federal_TaxRate;
    }

    public String toString() {
        return "Salary{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyRate=" + weeklyRate +
                ", state_TaxRate=" + state_TaxRate +
                ", federal_TaxRate=" + federal_TaxRate +
                '}';
    }

    public double salary(){

            double salary = hourlyRate * weeklyRate * 52;

        System.out.println("salary = " + salary);

            return  salary;

    }

    public double state_Tax (){
        double state_tax = state_TaxRate ;
        return state_tax;

    }

    public double federalTax(){

        double federalTax = federal_TaxRate ;
        return federalTax;

    }

    public double salaryAfterTax(){

        double reel_salary = salary() - state_Tax() - federalTax();
        System.out.println("reel_salary = " + reel_salary);
        return  reel_salary;

    }

    /*
    1. SalaryCalculator Task:
        1.1 Create a class named Salary calculator:
        Attributes:
            hourlyRate, stateTaxRate,  federalTaxRate, weeklyHours
            Add a constructor to set all the fields
        Actions:
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): calculates the totalStateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary,   stateTax, federalTax, salaryAfterTax of the Object


     */
}
