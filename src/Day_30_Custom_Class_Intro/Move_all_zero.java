package Day_30_Custom_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Move_all_zero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println("list = " + list);
        int size = list.size();
       // System.out.println("size = " + size);

        list.removeAll(Arrays.asList(0) );
        System.out.println("list = " + list);
        int new_size = list.size();
        // System.out.println("new_size = " + new_size);

        int total_zero_val = size - new_size;

        for (int i = 0; i < total_zero_val; i++) {
            list.add(0);
        }
        System.out.println("list = " + list);

        }
    }

