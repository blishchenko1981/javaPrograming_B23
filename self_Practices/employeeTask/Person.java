package employeeTask;

public class Person {
    private String name;
    private String lastName;
    private  static String city;
    public final static String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Person.city = city;
    }

    static {
        city = "Charlotte";
        country= "USA";

    }


    public Person(String name, String lastName, String city){
        setName(name);
        setLastName(lastName);
        setCity(city);
    }

    public void drink(String drink){
        System.out.println(name + "is drinking the" + drink);

    }
    public String workingOut(String excisise, int number){
        return name+ "doing"+ number + excisise + "in the " + city;
    }



}
