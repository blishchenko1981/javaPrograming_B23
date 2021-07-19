package strings;

import java.util.Scanner;

public class realEstate {

    public static void main(String[] args) {

        System.out.println("Welcome to the RealEstate calculator!");

        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if (houseType.equalsIgnoreCase("condo")) { propertyPrice += 50000; }
        if (houseType.equalsIgnoreCase("Townhouse")){ propertyPrice+= 75000;}
        if (houseType.equalsIgnoreCase("Single Family Home")){ propertyPrice+= 95000;}



        System.out.println("How many bedrooms do you have ?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice+= 30000*numberOfBedrooms;


        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if(backyard==true) {
            if (houseType.equalsIgnoreCase("Condo")) {
                System.out.println("Backyard is not available for condo!");
            }else if (houseType.equalsIgnoreCase("Townhouse") || houseType.equalsIgnoreCase("Single Family Home") ) {
                propertyPrice+= 5000;
            }else {propertyPrice += 0;}

        }
        System.out.println("Do you have a garage?");
        garage = scan.nextBoolean();

        if(garage == false) {propertyPrice+= 0;

        }
        else {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots > 10) {
                System.out.println("Pardon, it's not public parking!");
            } else {
                propertyPrice += 20000 * garageSpots;
            }
        }

        System.out.println("How close a metro station");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1.0){
            propertyPrice += 10000;
        }else if (metroAccessibility> 1 && metroAccessibility<= 3){
            propertyPrice += 5000;
        }else {
            propertyPrice+=0;
        }

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();

        if (highwayAccessibility<= 1){
            propertyPrice+= 15000;
        }else if(highwayAccessibility>1 && highwayAccessibility<= 5) {
           propertyPrice+= 8000;

        }else if(highwayAccessibility>5 && highwayAccessibility<= 20 ) {
            propertyPrice += 4000;
        } else {propertyPrice +=0 ;}

        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextFloat();
        if (schoolScore>= 8){
            propertyPrice += 45000;
        }else if(schoolScore>= 4 && schoolScore<8) {
            propertyPrice+= 20000;
        }else{
            propertyPrice+= 5000;
        }

        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if (smoking == true ){
            propertyPrice-= 5000;
        }

        System.out.println("Market report has been generated.\nYour estimate market price is: "+propertyPrice+"$");











    }
}
