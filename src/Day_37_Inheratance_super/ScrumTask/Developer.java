package Day_37_Inheratance_super.ScrumTask;

public class Developer extends Employee{

    public  Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName){

        super(name, age, gender, ID, jobTitle, salary, companyName);
    }

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is crying ");
    }
}
