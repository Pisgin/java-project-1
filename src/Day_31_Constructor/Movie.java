package Day_31_Constructor;

import java.util.ArrayList;

public class Movie {

    public String country , title , Genre , releaseDate;
    public String director;
    ArrayList<String> casts = new ArrayList<String>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }
    public void addCast(String sts){
        casts.add(sts);
    }

    public void addCasts(String [] str1){
        str1 = new String[5];
        casts.add(String.valueOf(str1));
    }

    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                '}';
    }

    public void addCasts(String muhammed) {
    }

    /*
    3.1. Create a class named Movie
    Attributes:
        country (String), title (String), Genre (String),
releaseDate (String), director (String), casts (ArrayList<String>)
Add a constructor to set the country, title, release
date, and director of the Movie
    Actions
        addCast(String): adds the given string argument
to the arrayList casts
        addCasts(String[]): adds the given string array
argument to the arrayList casts
        toString(): returns the name of country, title,
release date, and total number of casts
     */
}
