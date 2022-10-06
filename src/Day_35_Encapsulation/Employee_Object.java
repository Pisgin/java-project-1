package Day_35_Encapsulation;

public class Employee_Object {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setName("muhammed");
        emp1.setLastName("Pisgin");
        emp1.setSalary(100000);

        emp2.setName("zülal");
        emp2.setLastName("uzun  /  pisgin");
        emp2.setSalary(110000);

        System.out.println(emp1.getName() + " " + emp1.getLastName() + " " + emp1.getSalary() );
        System.out.println(emp2.getName() + " " + emp2.getLastName() + " " + emp2.getSalary() );


    }
}
