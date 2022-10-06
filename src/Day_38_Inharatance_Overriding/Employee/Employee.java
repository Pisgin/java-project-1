package Day_38_Inharatance_Overriding.Employee;

public class Employee {

    public String name , JobTitle ;
    public  int age  , ID ;
    public char gender;

    public String salaryName;

    public static String companyName;

    static {
        companyName = "CYDEO";
    }

    public Employee(String name, String jobTitle, int age, int ID, char gender, String salaryName) {
        this.name = name;
        JobTitle = jobTitle;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.salaryName = salaryName;
    }

    public void work() {

        System.out.println(name + " is working");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", salaryName='" + salaryName + '\'' +
                '}';
    }

    /*
            Create a class named Employee
Variables:
name, age, gender, id, jobTitle,
salaryName, comapnyName
Add a constructor to set all the fields
Methods:
work()
toString()
     */

}
