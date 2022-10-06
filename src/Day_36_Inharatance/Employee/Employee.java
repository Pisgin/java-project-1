package Day_36_Inharatance.Employee;

public class Employee {
    public  String name;
    public char gender;
    public int age;
    public int ID;
    public String jobTitle;
    public double salary;

    public Employee(){}

    public Employee(String name, char gender, int age, int ID, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setInfo(){
        System.out.println(" Employee name is " + name + " and " + ID + " no" );

    }
     public void work (){
         System.out.println(name + " is working");
     }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
