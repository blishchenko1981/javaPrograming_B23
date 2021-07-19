package day20_Loop;

public class CatsAndDogs {
    public static void main(String[] args) {
        String sentence = "Cat Dog Cat DogCat CatCat Cat Cat Cat vCat CatCat";
        int numberOfCats = 0;
        int numberOfDogs = 0;
        String word = "dog";


        for (int i = 0; i <= sentence.length() - word.length(); i++) {
         String each=    sentence.substring(i, i + word.length());
            System.out.println(each);

            if(each.equals("Cat")){
                numberOfCats++;
            }
            if(each.equals("Dog")) {
                numberOfDogs++;
            }
        }


        System.out.println("numberOfCats = " + numberOfCats);
        System.out.println("numberOf dogs = " + numberOfDogs);

        boolean equal = numberOfCats == numberOfDogs;
        System.out.println("equal = " + equal);

    }
}
//3. write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence
//
//        Ex:
//            sentence = "cat dog dog cat"
//
//            output:
//                true