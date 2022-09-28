package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class reverse_Array_and_Arraylist {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] new_array = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            new_array[j] = array[i];
        }
        System.out.println("new_array = " + Arrays.toString(new_array));
        System.out.println("-----------------------------------------------------------");

        ArrayList<Integer> new_arr = new ArrayList<>();

        new_arr.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7) );

        ArrayList<Integer> new_arr_reverse = new ArrayList<>();

        for (int i = new_arr.size() - 1 ; i >= 0 ; i-- ) {

            int  value = new_arr.get(i);
            new_arr_reverse.add(value);

        }
        System.out.println("new_arr_reverse = " + new_arr_reverse);


    }
}
