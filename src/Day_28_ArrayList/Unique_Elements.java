package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique_Elements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,3,3,4,5,5,6,7,7,8,9,9,0 ) );
        System.out.println("list = " + list);

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int freq = Collections.frequency(list , each);
                if (freq == 1)
                    unique.add(each);
        }
        System.out.println("unique = " + unique);
        System.out.println("-------------------------------------------");

        ArrayList<Integer> unique2 = new ArrayList<>();
        unique2.removeIf( p   ->  Collections.frequency( list , p) > 1);
        System.out.println("unique2 = " + unique2);
        System.out.println("---------------------------------------------");

    }
}
