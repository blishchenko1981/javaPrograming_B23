package restaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.setInfo("mr. Guilermo", "Downtown of Charlotte", 5);

        Server server1 = new Server();
        Server server2 = new Server();
        Server server3 = new Server();
        Server server4 = new Server();
        server1.setInfo("VanGogh", 12, 15.1,true);
        server2.setInfo("VanBurt", 13, 15.2,false);
        server3.setInfo("Goeogh", 14, 16.2,true);
        server4.setInfo("Vanya", 15, 15.7,true);
        Server [] servers = {server1,server2,server3,server4};


        Cheef chef1 = new Cheef();
        Cheef chef2 = new Cheef();
        Cheef chef3 = new Cheef();
        chef1.setInfo("Bill", 21,18.1, true);
        chef3.setInfo("John", 22,14.1, false);
        chef2.setInfo("Marta", 23,17.8, true);
        Cheef [] chefs = {chef1,chef2,chef3};


        restaurant.hireServer(servers);
        restaurant.hireCheef(chefs);

        System.out.println(restaurant);

        double costAllEmployee = 0;
        for (int i = 0; i < restaurant.serversList.size(); i++) {
           costAllEmployee += restaurant.serversList.get(i).hourlyRate;
        }
        for (int i = 0; i < restaurant.cheefsList.size(); i++) {
            costAllEmployee += restaurant.cheefsList.get(i).hourlyRate;
        }

        System.out.println("::::::::");
        System.out.println(costAllEmployee +"$ is a cost 1 hour of all employee");

        ArrayList<Server> fullTime = new ArrayList<>();
         fullTime.addAll(Arrays.asList(servers));
     //    fullTime.addAll(Arrays.asList(chefs)); ????????????????????????????
       fullTime.removeIf(p -> p.fulltime != true);
        System.out.println(fullTime);


        switch (restaurant.numbersOfStars) {

            case 3:
                if((restaurant.serversList.size()>=4 && (restaurant.cheefsList.size()>=1))){
                System.out.println("restaurant full up to standart");
            }else{
                if(restaurant.serversList.size()<4 ){
                    System.out.println("need to hire more servers");
                }
                if(restaurant.cheefsList.size()< 1){
                    System.out.println("Need to hire more chefs");
                };}
                break;
            case 4:
                if((restaurant.serversList.size()>=7 && (restaurant.cheefsList.size()>=3))){
                    System.out.println("restaurant full up to standart");
                }else{
                if(restaurant.serversList.size()<7 ){
                    System.out.println("need to hire more servers");
                }
                if(restaurant.cheefsList.size()< 3){
                    System.out.println("Need to hire more chefs");
                };}
                break;
            case 5:
                if((restaurant.serversList.size()>=10 && (restaurant.cheefsList.size()>=6))){
                    System.out.println("restaurant full up to standart");
                }else {
                    if (restaurant.serversList.size() < 10) {
                        System.out.println("need to hire more servers");
                    }
                    if (restaurant.cheefsList.size() < 6) {
                        System.out.println("Need to hire more chefs");
                    }

                }
                break;
        }

    }
}
/*
5. Create a class LocalRestaurant that has a main method with the following:
        	- Make a Restaurant object
        	- Create an array of servers with their information set.
        	Add those initial servers to the ArrayList of Servers in the Restaurant object
            - Create an array of chefs with their information set.
            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

            - Print your whole restaurants information

        Extra Tasks:
        	- Find out the cost of all the employees (servers + chefs) by checking all of their hourly rates

        	- Make two new ArrayLists that will separate all the employees (servers + chefs) by full time and part time.
        	 Their position of server or chef does not matter for these ArrayList, only their employment status

        	- Make sure the Restaurant is staffed enough for the level of stars it is using the following requirements:
                5 stars: need at least 6 chefs and 10 servers
                4 stars: need at least 3 chefs and 7 servers
                3 stars: need at least 1 chefs and 4 servers

            	- if the restaurant does not have the correct number of chefs or servers based on their number
            	of stars you should print a message: "Need to hire more $chefs or $servers (maybe both).
            	 Otherwise you can print: "Up to standard"


 */