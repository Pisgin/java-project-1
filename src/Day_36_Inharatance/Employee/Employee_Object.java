package Day_36_Inharatance.Employee;

public class Employee_Object {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.name = "Muhtar";
        teacher1.age = 28;
        teacher1.gender = 'M';
        teacher1.ID = 1234;
        teacher1.work();
        teacher1.setInfo();
        teacher1.teaching();

        System.out.println("teacher1 = " + teacher1);
        System.out.println("-----------------------------------------------");
        Tester tester1 = new Tester();

        tester1.name = "Muhammed";
        tester1.age = 30;
        tester1.ID = 3803;
        tester1.work();
        tester1.testing();

        Driver driver1 = new Driver();
     //   Developer devep1 = new Developer();
    }
}
