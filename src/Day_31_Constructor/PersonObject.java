package Day_31_Constructor;

public class PersonObject {
    public static void main(String[] args) {

         Person person1 = new Person("muhammed" , 3803 , 'M' ,30);
        System.out.println("person1 = " + person1);

        Person person2 = new Person("zülal" ,3020 , 'F' , 28);

        person2.age= 25;

        System.out.println("person2 = " + person2);

        System.out.println("---------------------------------------------------------");

    }
}
