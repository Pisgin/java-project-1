package Day_37_Inheratance_super.ScrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName){
        super(name, age, gender, ID, "Buainess Analyst", salary, companyName);
    }

    public void  analyze (){

        System.out.println( name + " is analyzing the documents");
    }

}
