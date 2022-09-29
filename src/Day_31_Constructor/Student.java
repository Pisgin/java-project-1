package Day_31_Constructor;

public class Student {
    public String  name;
    public char grade   , gender;
    public int ID , age;

    public Student(String name, char grade, char gender, int ID, int age) {
        this.name = name;
        this.grade = grade;
        this.gender = gender;
        this.ID = ID;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gender=" + gender +
                ", ID=" + ID +
                ", age=" + age +
                '}';
    }
}
