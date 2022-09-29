package Day_31_Constructor;

public class Offer {
    public String location;
    public String companyNamed;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit, isWFH;
    public boolean hasPTO, isFullTime;


    public void setInfo(String c_name, String locati, double salar, String title , boolean benef ) {
        location = locati;
        companyNamed= c_name;
        salary = salar;
        jobTitle =title;
        hasBenefit= benef;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyNamed='" + companyNamed + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", isWFH=" + isWFH +
                ", hasPTO=" + hasPTO +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
