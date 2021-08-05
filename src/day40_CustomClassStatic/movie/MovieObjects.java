package day40_CustomClassStatic.movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {


        Movie movie1 = new Movie();
        movie1.setInfo("USA", "Journey to QA", "comedy, adventue", "Kuzzat Altay", LocalDate.of(2021,05,17));


        String[] casts = {"Mehmet", "Akbar"};
        movie1.addCast("Asiya");
        movie1.addCast(casts);
        ArrayList<String> students= new ArrayList<>();
        students.addAll(Arrays.asList("Vitalii", "Kseniia", "Sabir", "Abbos"));
        movie1.addCast(students);

        System.out.println(movie1);

    }
}