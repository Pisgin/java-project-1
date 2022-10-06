package Day_35_Encapsulation;

public class CyberteckStudents {
    public String name;
    public char gender;
    public  int age , batchNumber , groupNumber ;
    public static String schoolName;
    public String fieldofStudy;
    public static String pragrammingLanguage;
    public static String secretCode;

    public CyberteckStudents(String name, char gender, int age, int batchNumber, int groupNumber, String fieldofStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        //  this.schoolName = schoolName;
        this.fieldofStudy = fieldofStudy;
        //  this.pragrammingLanguage = pragrammingLanguage;
    }

    static {

        schoolName = "CYDEO";
        pragrammingLanguage = "JAVA";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName (){
        System.out.println(" scholl name is : " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("code is : " + secretCode);
    }

    public  void study(){
        System.out.println( name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is attending class. ");
    }

    public String toString() {
        return "CyberteckStudents{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName='" + schoolName + '\'' +
                ", fieldofStudy='" + fieldofStudy + '\'' +
                ", pragrammingLanguage='" + pragrammingLanguage + '\'' +
                '}';
    }
}
