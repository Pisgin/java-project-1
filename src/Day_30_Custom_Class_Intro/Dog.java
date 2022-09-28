package Day_30_Custom_Class_Intro;

import javax.xml.stream.events.DTD;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public  void eat(){
        System.out.println(name + " is eatig");
    }
    public void bark(){
        System.out.println(name + " is barking");
    }
    public  void drink(){
        System.out.println(name + " is drinking");
    }

    public void setInfo(String dogName , String dogBreed , int dogAge , char dogGender , String dogColor , String dogSize ){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
