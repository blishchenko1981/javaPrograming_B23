package day38_CustomClass.offerTask;

public class Offer {
    public String state, city, jobTitle;
    public double salary;
    public boolean hasBenefits, isWFH, hasPTO;

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefits=" + hasBenefits +
                ", isWFH=" + isWFH +
                ", hasPTO=" + hasPTO +
                '}';
    }

    public void setInfo(String state, String city, String jobTitle, double salary, boolean benefits, boolean hasBenefits, boolean isWFH, boolean hasPTO) {
        this.state = state;
        this.city = city;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;


    }
}
