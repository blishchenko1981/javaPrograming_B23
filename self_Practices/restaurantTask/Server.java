package restaurantTask;

public class Server {

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
    public void takeOrder(){
        System.out.println(name + "is taking order");
    }
    public void cleaningTable(){
        System.out.println(name + "is cleaning table");
    }

    @Override
    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ( (fulltime)?"full-time":"part-time");
    }
}
/*
1.  Create a class called Server

        Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)

        Actions: (all void methods)

            setInfo(): sets all of the instance variables with some values taken from the parameters.
            takeOrder(): server's name + "is taking an order"
            cleanTable(): server's name + "is cleaning the table"
            toString(): Returns (String) all the information of a Server
                -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"

 */