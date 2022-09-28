package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLıst_Intro {
    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList <String>();
        name.add("muhammed");
        name.add("zülal");
        name.add("meriç");
        name.add("yavuz");
        name.add("fatih");

        System.out.println(name);
        System.out.println( name.size() );

        name.add("mahmut");

        System.out.println(name);
        System.out.println("-------------------------------");

        name.remove(5);
        System.out.println(name);
        System.out.println("--------------------------------");

        System.out.println( name.get(3) + " " + name.get(0));

        System.out.println("*******************************");

        name.add("selman");
        System.out.println(name);

        System.out.println("**********************************");

        boolean b1 = name.remove("yavuz");

        boolean b2 = name.remove("mahmut");

        System.out.println("name = " + name);

        System.out.println("b1 = " + b1);

        System.out.println("b2 = " + b2);

        System.out.println("---------------------------------");

        name.clear();
        System.out.println("name = " + name);
        System.out.println( name.size() ) ;

        System.out.println("-----------------------------------");

        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("numbers = " + numbers);
        int a1 = numbers.indexOf(10);
        System.out.println("a1 = " + a1);
        System.out.println("************************************");
        int a2 = numbers.lastIndexOf(10);
        System.out.println("a2 = " + a2);

        System.out.println("-------------------------------------------------");

        System.out.println("name = " + name);
        boolean b7 = name.isEmpty();
        System.out.println("b7 = " + b7);

        System.out.println("*************************************");

        name.add("muhammed");
        name.add("zülal");
        name.add("meriç");
        System.out.println("name = " + name);

        boolean b3 = name.contains("yavuz");
        System.out.println("b3 = " + b3);

        boolean b4 = name.contains("meriç");
        System.out.println("b4 = " + b4);
        System.out.println("********************************");

        ArrayList<String> name1 = new ArrayList<>();
        name1.add("muhammed");
        name1.add("zülal");
        name1.add("meriç");

        boolean b5 = name1.equals(name);
        System.out.println("b5 = " + b5);
        System.out.println("*****************************");

        boolean b6 = name1.isEmpty();
        System.out.println("b6 = " + b6);
        System.out.println("********************************");


            // numbers : [ 0 , 10 ,  20 , 10 , 20 , 20 , 30 , 10 , 40 , 50 ]

        boolean b8 = numbers.containsAll(Arrays.asList(10 ,20 ,30 ,40) );
        System.out.println("b8 = " + b8);

        boolean b9 = numbers.containsAll(Arrays.asList(10 ,20 ,30 ,45) );
        System.out.println("b9 = " + b9);

        System.out.println("----------------------------------------------------------");

        System.out.println("numbers = " + numbers);
        numbers.addAll(Arrays.asList( 70 , 80 , 90 , 100 ) );
        System.out.println("numbers = " + numbers);
        System.out.println("*******************************************");

        System.out.println("numbers = " + numbers);
        numbers.removeAll(Arrays.asList( 0 , 20 , 50 ,  90 ) );
        System.out.println("numbers = " + numbers);

        System.out.println("*******************************************");

        numbers.retainAll(Arrays.asList( 40 , 80 , 100 ) );
        System.out.println("numbers = " + numbers);




    }
}
