package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Unique_Characters {
    public static void main(String[] args) {

        String str = "aaabbbcddeeeffg";

        ArrayList<String> char_elements = new ArrayList<>(Arrays.asList(str.split("") ) );

        System.out.println("char_elements = " + char_elements);
    String unique = "";
        for ( String each : char_elements   ) {
            int freq = Collections.frequency(char_elements , each);

            if (freq == 1)
                unique += each + " ";
        }

        System.out.println("unique = " + unique);




    }
}
