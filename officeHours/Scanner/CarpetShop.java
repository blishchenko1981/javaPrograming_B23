package Scanner;

import practice_09_06_21.Switch;

import java.util.Scanner;

public class CarpetShop {

    public static void main(String[] args) {

        /*
        2.CarpetShop

						- Ask the user which room do they need carpet? (String)
									List of Rooms
										Bedroom
										Kitchen

				            -> If the user gives other than these roomTypes ,  give an error message about "Invalid Room Type"

				        - Ask the user roomType dimensions (as meter and double)
				        		Kitchen is circle.Take radius from user
				        		Bedroom is square or Rectangle.Take lenght and width from user

				        - Ask the user to deliver address (String, multiple words)
				        - unitPriceForCarpet = 3.92
				        - totalcost = area*unitPriceForCarpet;

				        - Print in the following format:
				            Ex:
				                inputs: Bedroom,length 4,width 3,1300 Lamar St Houston TX 77010

				                 "TotalCost for your carpet is 51.84 and it will be deliver 1300 Lamar St Houston TX 77010 in one week"

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Type \n 1-bedroom. 2 - kitchen");
        String roomType = scan.nextLine();
        double area = 0;

        switch (roomType){
            case "kitchen":
                int radius = scan.nextInt();
                area = radius*radius*3.16;


                break;

            case "bedroom":
                int length = scan.nextInt();
                int wigth = scan.nextInt();
                area = length* wigth;


                break;
            default:
                System.out.println("Invalid room type");
                break;



        }
        double unitPrice = 35.3;
        double totalPrice = area * unitPrice;
        scan.nextLine();
        System.out.println("address");
        String address = scan.nextLine();
        System.out.println("area"  +area);
        System.out.println("TotalCost for your carpet is " + totalPrice +"and it will be deliver"+ address);




        scan.close();
    }

}
