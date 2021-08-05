package day40_CustomClassStatic;

public class Address {

public String buildingNumber, street, city, state;
public int zipCode;

public static String country = "USA";

/*public void setInfo()   {
    System.out.println(country);
    System.out.println(buildingNumber);
}

public static void setInfo2(){
    System.out.println(country);
    System.out.println(buildingNumber); // !!!! NON STATIC cant be used in static method
}

 */

    public void setInfo (String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return
                buildingNumber + " "+ street + "\n" + city + " " + state + ", " + zipCode;


    }
}
