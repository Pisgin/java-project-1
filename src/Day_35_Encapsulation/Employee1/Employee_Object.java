package Day_35_Encapsulation.Employee1;

public class Employee_Object {
    public static void main(String[] args) {


        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e2.setGender('D');
        e1.setGender('F');
        e1.setName("muhammed");
        e1.setSalary(12000);
        e1.setAge(25);
        System.out.println("e1 = " + e1);
        System.out.println("--------------------------------------");
        System.out.println("e2 = " + e2);

    }
}
