package Day_35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class quizz {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        list.set(0, list.get(4));
        list.set(4, list.get(0));

        System.out.println(list);

        ArrayList<String> ll = new ArrayList<>();
        ll.add("aaa");
        ll.add("bbb");
        ll.add("ccc");
        ll.add("ddd");
        ll.add(3, "aa");

        System.out.println(ll);

    }
}
