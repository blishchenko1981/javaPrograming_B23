package practice06_23_21;

public class SearchResult {

    public static void main(String[] args) {
        /*
        Task 3 : Assume that you searched a word in Google  Search Engine.
        After that you took a result message like 		 this


	    "About 640,000,000 results (0.78 seconds)"

		 According to this result print out search Time and number of Result

		 Input :  "About 640,000,000 results (0.78 seconds)"

	 Output:
				Result number is 640,000,000
				Response time is 0.78 seconds


         */
        String result =  "About 640,000,000 results (0.78 seconds)";

        int startIndex = result.indexOf(" ");
        int endIndex = result.indexOf(" r");
        System.out.println(startIndex);
        System.out.println(endIndex);

        String searchResults = result.substring(startIndex + 1, endIndex);

        System.out.println(searchResults);

        int firstIndex = result.indexOf("(");
        int lastIndex = result.indexOf(")");

        String searchTIme = result.substring(startIndex+ 1, lastIndex);
        System.out.println(searchTIme);








    }
}
