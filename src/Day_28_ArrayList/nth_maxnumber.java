package Day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class nth_maxnumber {

    public static int maxnumber(ArrayList<Integer> array , int nth) {

        for (int i = 1; i < nth; i++) {

            int max = Collections.max(array);  //   8 ( 3 )  7     6

            System.out.println("list = " + array);

             array.remove(Collections.max(array));  //  1 --> 8  ( 2 )

            for (int j = 0; j < array.size(); j++) {

                int max1 = Collections.max(array);   //  8  ( 2 )   8 ( 1 )

                if (max == max1) {

                    int value = array.get(j);    //    1  2  3  4  5  6  7  8

                    if (value == max1) {      //

                        array.remove(Collections.max(array));    //  8 ( 1 )
                        j--;
                    }
                } else {
                    continue;
                }
            }
        }


        int final_max = Collections.max(array);

        System.out.println("list = " + array);

        System.out.println( nth +"nh largest number : " + final_max );

        return  final_max;
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList( 1, 2, 3, 4, 5, 5, 6, 7, 7, 7, 7, 8, 8, 8 , 8 ,9 ));

        System.out.println("list = " + list);

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number : "   );  //   3
        int val = scan.nextInt();

        /*
             for (int i = 1 ; i < val  ; i++){

            int max = Collections.max(list);  //   8 ( 3 )  7     6

            System.out.println("list = " + list);

            list.remove(Collections.max(list));  //  1 --> 8  ( 2 )



                for (int j = 0; j < list.size() ; j++){

                    int max1= Collections.max(list);   //  8  ( 2 )   8 ( 1 )

                    if(max == max1){

                        int value = list.get( j );    //    1  2  3  4  5  6  7  8

                        if ( value == max1 ) {      //

                             list.remove(Collections.max(list));    //  8 ( 1 )
                            j--;
                        }
                    } else{

                        continue;
                    }
                }


        }

        int final_max = Collections.max(list);

        System.out.println("list = " + list);

        System.out.println( val +"nh largest number : " + final_max );



 */

        maxnumber(list, val);

        /*
          for ( int i = 1 ; i < val ; i++ ){
              list.removeIf( p -> Collections.max( list ) == p )
           }

        int final_max = Collections.max( list );
        System.out.println( "nth max_number : " + final_max );

         */

    }
}
