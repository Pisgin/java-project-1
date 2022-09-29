package Day_31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        offer1.setInfo("Scotty", "Izmır" , 15000 , "mükellef" , true);

        Offer offer2 = new Offer();
        offer2.setInfo("yavuz" , "Izmır" , 10000 , "Derici" , true)  ;

        Offer offer3 = new Offer();
        offer3.setInfo("fatih" , "samsun" , 13500 , "Bankacı" , true) ;

        Offer [] list  = { offer1 , offer2 ,offer3 } ;
        ArrayList <Offer> new_arr = new ArrayList <> ( Arrays.asList( list ) );
        System.out.println("new_arr = " + new_arr);


        new_arr.removeIf( p  -> !p.location.equals("Izmır"));
        System.out.println(new_arr.size());

    }
}