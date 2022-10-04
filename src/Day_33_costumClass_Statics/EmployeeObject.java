package Day_33_costumClass_Statics;

public class EmployeeObject {
    public static void main(String[] args) {
         Employee employee1 = new Employee();
        employee1.name = "muhammed";

        Employee employee2 = new Employee();
        employee1.name = "zülal";

        Employee employee3 = new Employee();
        employee1.name = "meriç";

        System.out.println(employee1.name);
        System.out.println(employee2.name);
        System.out.println(employee3.name);

        System.out.println("-------------------------------------------");

        Iphone Iphone1 = new Iphone();
        System.out.println(Iphone1.brand + " made in " + Iphone1.madeIn);





    }
}
