package Day_31_Constructor;

public class Person {

    public Person(String  name , int ID , char gender , int age){

        this.name = name;
        this.ID = ID;
        this.age = age;
        this.gender = gender;

    }


    public String name;
    public int ID  , age;
    public char gender;


    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
