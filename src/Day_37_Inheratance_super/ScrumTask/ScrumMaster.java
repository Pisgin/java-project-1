package Day_37_Inheratance_super.ScrumTask;

public class ScrumMaster extends Employee {

    public ScrumMaster (String name, int age, char gender, int ID, String jobTitle, double salary, String companyName){

        super( name, age, gender, ID, "Scrum Master", salary, companyName);
    }


}
