package Day_37_Inheratance_super.ScrumTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName){

        super(name, age, gender, ID, jobTitle, salary, companyName);
    }
    public void  createTickets (){
        System.out.println(jobTitle + " " + name + " is creating ticket ");
    }

}
