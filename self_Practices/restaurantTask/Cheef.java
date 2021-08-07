package restaurantTask;

public class Cheef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fulltime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fulltime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fulltime = fulltime;
    }
     public void makeOrder(){
         System.out.println(name + "is making an order");
     }
     public void washDishes(){
         System.out.println(name + " is washing dishes");
     }

    public String toString() {
        return "Cheef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fulltime=" + ((fulltime)? "full-time": "part- time");
    }
}
/*
2. Create a class called Chef

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"
                toString(): Returns (String) all the information of a Chef
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */