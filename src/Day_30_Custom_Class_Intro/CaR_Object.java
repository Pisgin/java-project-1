package Day_30_Custom_Class_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class CaR_Object {
    public static void main(String[] args) {

        CaR car1 = new CaR();
        car1.setInfo("Toyata" , "Corolla" , 2020 , "White" , 100000);
        System.out.println("car1 = " + car1);
        System.out.println("------------------------------------------------------");

        CaR car2 = new CaR();
        car2.setInfo("Audi" , "A3" , 2019 , "Black" , 120000);
        System.out.println("car2 = " + car2);
        System.out.println("------------------------------------------------------");

        CaR car3 = new CaR();
        car3.setInfo("Mercedes" , "Vito" , 2004 , "Grey" ,85000) ;
        System.out.println("car3 = " + car3);
        System.out.println("------------------------------------------------------");


        CaR [] cars = {car1 , car2 ,car3 };

        ArrayList<CaR> car_list = new ArrayList<>();
        car_list.addAll(Arrays.asList(cars));
      //   System.out.println("car_list = " + car_list);
        System.out.println("------------------------------------------------------");

        for (CaR each : car_list   ) {
            System.out.println(each.brand + "   :    " + each.price );
        }
        
        
        
        
        
    }
}
