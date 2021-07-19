package practice06_23_21;

public class CategoryName {
    public static void main(String[] args) {
        /*
         Task 4 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

			   "https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			 								(main category)
			 According to this result print out main category name

			 Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

		 Output:
				Main Category name is  toys and games

		 Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 								     (main category)

						 Output:
						 			Main Category name is  toys and entertainment



			Topic : For Loop

         */

        String url = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";

        int startIndex = url.indexOf("c/");
        int endIndex = url.indexOf ("?");

        String categoryName = url.substring(startIndex + 2 , endIndex);
        System.out.println(categoryName);

       categoryName=  categoryName.replace("-", " ");
        System.out.println(categoryName);






    }
}
