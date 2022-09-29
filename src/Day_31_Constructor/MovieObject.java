package Day_31_Constructor;

import java.util.ArrayList;

public class MovieObject {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Turkey" , "Fear" , "20/07/2022" , "muhammed");
        Movie movie2 = new Movie("USA" , "Comedy" , "25/07/2022" , "zülal");

        Movie movie3 = new Movie("USA" , "Journey to SDET", "10/25/2021", "Kuzzat Altay");
        movie3.addCast("Asiya");
        movie3.addCast("Adam");
        movie3.addCast("Muhtar");
        movie3.addCasts("muhammed");
    }
}
