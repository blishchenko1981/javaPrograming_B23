package day58_Maps;

import java.util.*;

public class ListOfMaps {
    public static void main(String[] args) {

        Map<String , String > scrum1 = new LinkedHashMap<>();
        scrum1.put("Elza","SDET");
        scrum1.put("Mehmet","Developer");
        scrum1.put("Stefan","Developer");
        scrum1.put("Rishat","PO");
        scrum1.put("Ismail","SM");
        scrum1.put("Tamara","SDET");
        scrum1.put("Adnan","QA");
        scrum1.put("Ibrahim","Developer");
        scrum1.put("Mehmut","QA");
        Map<String , String > scrum2 = new LinkedHashMap<>();
        scrum2.put("Matthew", "1");
        scrum2.put("Komiljon", "2");
        scrum2.put("Alina","3");
        scrum2.put("Christina","4");
        scrum2.put("Malika", "SM");
        scrum2.put("Metin", "6");
        scrum2.put("Altynai","7");
        scrum2.put("Rabia","8");
        scrum2.put("Yelaman", "9");
        scrum2.put("Altanochir", "10");
        Map<String , String > scrum3 = new LinkedHashMap<>();
        scrum3.put("Matthew", "PO");
        scrum3.put("Komiljon", "SDET");
        scrum3.put("Alina","SDET");
        scrum3.put("Christina","Develepor");
        scrum3.put("Malika", "Developer");
        scrum3.put("Metin", "SM");
        scrum3.put("Altynai","Sdet");
        scrum3.put("Rabia","SDET");
        scrum3.put("Yelaman", "Developer");
        scrum3.put("Altan", "SM");
        Map<String , String > scrum4 = new LinkedHashMap<>();
        scrum4.put("Jenna","Developer");
        scrum4.put("Zaid","PO");
        scrum4.put("Nate","SM");
        scrum4.put("Zully","SDET");
        scrum4.put("Dilem","Teser");
        scrum4.put("Alex","Developer");
        scrum4.put("Ha","Tester");
        Map<String , String > scrum5 = new LinkedHashMap<>();


        List<Map<String, String>> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(scrum1,scrum2,scrum3, scrum4, scrum5));


        System.out.println("-------------------------------------------------");



       for (Map<String, String> employee : employees) {

           for (Map.Entry<String, String> entry : employee.entrySet()) {
               if (entry.getKey().equalsIgnoreCase("developer")) {
                   System.out.println("SM = " + entry.getKey());
               }
           }
       }
        System.out.println("---------------------------------------------");

       // print names of developers

        for (Map<String, String> map : employees) {
            for (Map.Entry<String, String> entry : map.entrySet()) {

                if(entry.getKey().equalsIgnoreCase("developer")){

                    System.out.println(entry.getKey() +" developer");
                }

            }
        }






    }
}
