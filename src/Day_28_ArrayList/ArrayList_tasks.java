package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_tasks {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("list1 = " + list1);
        list1.remove(4);

        list1.add(0);
        System.out.println("list1 = " + list1);
        System.out.println("**********************************");

        int a1 = list1.get(0);   // 1
        list1.set(0 , list1.get(4) );
        list1.set(4 , a1);
        System.out.println("list1 = " + list1);
        System.out.println("**********************************");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println("list2 = " + list2);

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 == 1){
                int new_int= 2 * list2.get(i);
                list2.set(i , new_int);
            }
        }
        System.out.println("list2 = " + list2);
        System.out.println("***************************************");

        String [] arr1 = { "A" , "B" ,"C" , "D"};
        String [] arr2 = {"E" ,"F", "G" , "H" };

        ArrayList<String> list3 = new ArrayList<>();

        list3.addAll(Arrays.asList(arr1));
        list3.addAll(Arrays.asList(arr2));

        System.out.println("list3 = " + list3);
        System.out.println("****************************************");

        int max = list2.get(0);
        int min = list2.get(0);
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > max)
                max = list2.get(i);
            if (list2.get(i ) < min)
                min = list2.get(i);

        }
        System.out.println("max = " + max);

        System.out.println("min = " + min);
        System.out.println("***********************************");

        //  [1,2,2,3,4,4,5,6,7,7]

        ArrayList<Integer> number_list1 = new ArrayList<>();

        number_list1.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7) );
      /*  System.out.println("number_list1 = " + number_list1);

        int sayı=0;
        for (int i = 0; i < number_list1.size() ; i++) {

            sayı = number_list1.get(i);

            for (int j = 0; j <number_list1.size() ; j++) {
                if (sayı == number_list1.get(j))
                    break;
            }

        }
        System.out.println(sayı);

*/
        //    100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47)

        ArrayList< Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList( 100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47) );

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (int i = 0; i < scores.size(); i++) {
            int a2 =  scores.get(i);
            if ( a2 >= 90 ) {
                gradeOfA.add(a2);
            }else if ( 80 <= a2 && a2 < 90 ) {
                gradeOfB.add(a2);
            } else if ( 70 <=  a2&& a2 < 80 ) {
                gradeOfC.add(a2);
            } else if ( 60 <= a2 && a2 < 70 ) {
                gradeOfD.add(a2);
            }else{
                gradeOfF.add(a2);
          }

        }

        System.out.println("gradeOfA = " + gradeOfA);
        System.out.println("gradeOfB = " + gradeOfB);
        System.out.println("gradeOfC = " + gradeOfC);
        System.out.println("gradeOfD = " + gradeOfD);
        System.out.println("gradeOfF = " + gradeOfF);

        System.out.println("*****************************************");






    }



    }

