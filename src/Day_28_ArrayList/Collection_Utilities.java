package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utilities {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        System.out.println("list = " + list);

        Collections.sort(list);

        System.out.println("list = " + list);
        System.out.println("----------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(23 ,34 ,5 ,22,1) );
        System.out.println("list1 = " + list1);

        Collections.reverse(list1);

        System.out.println("list1 = " + list1);
        System.out.println("----------------------------------------------------");

        System.out.println("list1 = " + list1);

        Collections.swap(list1 , 1,2);
        System.out.println("list1 = " + list1);

        Collections.swap(list1 , 3,4);
        System.out.println("list1 = " + list1);
        System.out.println("----------------------------------------------------");

        int min = Collections.min(list1);
        int max = Collections.max(list1);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(10 ,10 ,20 ,30 ,40 , 10 ,10 ,50) );

        System.out.println("list2 = " + list2);

        Collections.replaceAll(list2 , 10 , 1000);

        System.out.println("list2 = " + list2);

        System.out.println("-------------------------------------------------");

        int freq = Collections.frequency(list2 , 1000 );
        System.out.println("freq = " + freq);
        System.out.println("--------------------------------------------------");



    }
}
