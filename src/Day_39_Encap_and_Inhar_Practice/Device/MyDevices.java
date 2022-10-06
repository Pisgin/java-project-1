package Day_39_Encap_and_Inhar_Practice.Device;

import java.util.ArrayList;

public class MyDevices {

    public static void main(String[] args) {

        Samsung samsung = new Samsung("A70" , 5000 , true , true);

        Iphone ıphone = new Iphone( "13 pro" , 10000 , true , true);

        Desktop desktop = new Desktop(15000 , true , true);

        Computer computer = new Computer("MSI" , 20000 , false , true);

      ıphone.call ( 459143787 );
      ıphone.text ( 535583336 );
      samsung.turnOn();
      samsung.turnOff();
      desktop.getModel();
      desktop.getPrice();
      computer.getBrand();
      computer.getModel();
      computer.turnOn();
      computer.turnOff();


    }
}
