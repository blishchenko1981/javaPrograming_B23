package day39_CustomClass_Staics.carpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {


        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(5,2,3.5,true);
        carpets[1].customOrder(4,3,10.2,false);
        carpets[2].customOrder(6,1,6.5,true);
        carpets[3].customOrder(5.5,3.5,10.3,false);
        carpets[4].customOrder(10,2,11.1,true);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(carpet -> !carpet.isPersian);


        ArrayList<Carpet> regularCarpets = new ArrayList<>(Arrays.asList(carpets));
        regularCarpets.removeIf(carpet -> carpet.isPersian);


        /*for(Carpet each : carpets) {
            if(each.isPersian){
                persianCarpets.add(each);
            }else{
                regularCarpets.add(each);
            }
        }

         */
        System.out.println("Number of Persian carpets: " + persianCarpets.size());
        System.out.println("Number of regular carpets: " + regularCarpets.size());

        for(Carpet persianCarpet : persianCarpets){
            System.out.println(persianCarpet);
        }



    }
}
