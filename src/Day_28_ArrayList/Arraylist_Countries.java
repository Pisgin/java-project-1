package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_Countries {
    public static void main(String[] args) {

        ArrayList<String > countries = new ArrayList<>();
        countries.addAll(Arrays.asList("Japan" , "Korea" , "United States" , "Turkey" , "United Kingdom" ,"Canada") );

        System.out.println("countries = " + countries);

        for (int i = 0; i < countries.size(); i++) {
            String each = countries.get(i);
            if (each.length() > 10){
                countries.remove(i);
            }

        }
        System.out.println("countries = " + countries);

    }
}
