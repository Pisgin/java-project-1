package Day_37_Inheratance_super.ScrumTask;

public class Employee  extends  Person{

    public int ID;
    public String jobTitle;
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }

    public  void work() {
        System.out.println(jobTitle + " " + name + " " + " is working");
    }

    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
