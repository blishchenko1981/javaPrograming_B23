package restaurantTask;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public String owner, location;
    public  int numbersOfStars = 5;
    public ArrayList<Server> serversList = new ArrayList<>();
    public ArrayList<Cheef> cheefsList = new ArrayList<>();

    public void setInfo(String owner, String location, int numbersOfStars) {
        this.owner = owner;
        this.location = location;
        this.numbersOfStars = numbersOfStars;
    }
    public void hireServer(Server server){
        serversList.add(server);
    }
    public void hireServer(Server [] server){
        serversList.addAll(Arrays.asList(server));
    }
    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime){
        Server server = new Server();
        server.setInfo(name,employeeID,hourlyRate,fullTime);

        serversList.add(server);

    }

    public void hireCheef(Cheef cheef){
        cheefsList.add(cheef);
    }
    public void hireCheef(Cheef []cheef){

        cheefsList.addAll(Arrays.asList(cheef));
    }
    public void hireCheef(String name, int employeeID, double hourlyRate, boolean fullTime){

        Cheef cheef = new Cheef();
        cheef.setInfo(name, employeeID,hourlyRate,fullTime);
        cheefsList.add(cheef);
    }

    public  String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", servers=" + serversList.size() +
                ", cheefs=" + cheefsList.size() +
                ", numbersOfStars-" + numbersOfStars+
                '}';
    }

        public void terminateEmployee( String title, int employeeID){
            if(title.equals("server") || title.equals("chef")){
                serversList.removeIf(S-> S.employeeID == employeeID);
                cheefsList.removeIf(C -> C.employeeID == employeeID);
            }else{
                System.out.println("invalid employee type");
            }






        }

        public void terminateServer(String title, int employeeID) {
        if(title.equalsIgnoreCase("server")){
            serversList.removeIf(p-> p.employeeID == employeeID);
        }
        }
        public void terminateChef ( String title, int employeeID){
        if(title.equalsIgnoreCase("Chef")) {
            cheefsList.removeIf(p -> p.employeeID == employeeID);
        }
        }
}
/*
3. Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)

            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime):
                    this overloaded version accept the given parameters/information of a Server and will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs

                toString(): Return (String) of all the information of a Restaurant object.
                No need to print the whole list of Servers or Chefs.
                Print the number of Servers and Chefs along side the other information

                terminateEmployee(String title, int employeeID):
                 Create a method that will accept a String title which can only be "server" or "chef".
                   If any other String is given it is invalid and the no action should be done
                   (an error message can be given "invalid employee type").
                   Once you know which type of employee you are terminating use their given
                   employeeID in the correct ArrayList type and remove them
                    (you can give a message if you want: "$name was terminated").

 */