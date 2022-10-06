package Day_38_Inharatance_Overriding.Car;

import java.util.Arrays;

public class ParkinLot {
    public static void main(String[] args) {



        Toyota toyota1  = new Toyota( "Corolla" , 2020 , "White" ,  4000 );

        toyota1.reliable();
        toyota1.start();
        toyota1.drive();

        Toyota toyota2 = new Toyota( " Yaris" , 2019 , "Blue" , 5000);

        Tesla tesla1 = new Tesla("Space X" , 2022 , "Grey" , 0);

        BMW BMW1 = new BMW("116i" , 2021 , "Black" , 1000);

        Car [] cars = {toyota1 , toyota2 , tesla1 , BMW1};

     //   System.out.println(Arrays.asList(cars));

        System.out.println("-----------------------------------------------");

        toyota1.start();
        System.out.println("-----------------------------------------------");
        tesla1.start();
        System.out.println("-----------------------------------------------");
        BMW1.start();
        System.out.println("-----------------------------------------------");
        toyota2.start();



    }
}
