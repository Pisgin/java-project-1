package Day_32_Contructor;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee("muhammed");

        Employee employee2 = new Employee("zülal" , 'F');

        Employee employee3 = new Employee("meriç" , 'M' , "SDET" , 16000);

        Employee employee4 = new Employee("yavuz" , 'M' , "Student");

        System.out.println("employee1 = " + employee1);

        System.out.println("employee1 name = " + employee1.name);

        System.out.println("employee2 = " + employee2);

        System.out.println("employee3 = " + employee3);

        System.out.println("employee4 = " + employee4);

    }
}
