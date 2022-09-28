package Day_28_ArrayList;

import java.util.ArrayList;

public class FirstUnıque_elements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        for (Integer each : list ) {
            int freq = 0;

            for (Integer element : list ) {
                if (element == each)
                    freq++;
            }

            if (freq == 1){
                System.out.println("First_Unique : " + each);
                break;
            }

            //removeIf() methodu ARAŞTIRRRRR!!!


        }





    }

}
