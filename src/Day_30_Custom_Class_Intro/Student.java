package Day_30_Custom_Class_Intro;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void setInfo(String names , int ages , int IDs, char grades, char genders){
        this.name = names;
        this.age = ages;
        this.ID = IDs;
        this.gender = genders;
        this.grade = grades;




    }




}
