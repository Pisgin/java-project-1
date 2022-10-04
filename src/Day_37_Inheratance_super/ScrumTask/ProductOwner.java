package Day_37_Inheratance_super.ScrumTask;

public class ProductOwner extends Employee{

    public ProductOwner( String name, int age, char gender, int ID, String jobTitle, double salary, String companyName){

        super( name, age, gender, ID, "Product Owner", salary, companyName);
    }

}
