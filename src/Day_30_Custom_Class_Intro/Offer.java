package Day_30_Custom_Class_Intro;

public class Offer {



        public String location;
        public String companyNamed;
        public String jobTitle;
        public Double salary;
        public Boolean hasBenefit, isWFH;
        public Boolean hasPTO, isFullTime;


    public  void setInfo(String c_name, String locati, Double salar, String title) {
        location = locati;
        companyNamed= c_name;
        salary = salar;
        jobTitle =title;
    }


}
