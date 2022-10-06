package Day_35_Encapsulation.Employee1;

public class Employee {
    private  String  name;
    private char gender;
    private  double salary;
    private int age;

    public String getName() {
        return name;
    }
    public Employee(){}

    public Employee(String name, char gender, double salary, int age) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
    }

    public void setName(String name) {
        if ( name.isEmpty() ) {
            System.err.println("Invalid values");
            return;
        }else
            this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (  !(gender == 'f' || gender == 'm' || gender == 'F' || gender ==  'M') ) {
            System.out.println("Invalıd value");
            return;
        }else
            this.gender = gender;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0)
            System.out.println("Invalid value");
        else
            this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        if (age <= 16 || age > 90)
            System.out.println("Invalid value");
        else
            this.age = age;
    }
}
