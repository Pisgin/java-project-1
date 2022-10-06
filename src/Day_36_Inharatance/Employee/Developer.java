package Day_36_Inharatance.Employee;

public class Developer extends Employee {

    public Developer(String name, char gender, int age, int ID, String jobTitle, double salary){
        super( name, gender, age, ID, jobTitle, salary);
    }

    private  void coding (){
        System.out.println("only " + getName() + " are making coding proccess  ");
    }

    private  void  fixingBugs (){
        System.out.println("only " + getName() + " are making Bugs proccess  ");
    }

}
