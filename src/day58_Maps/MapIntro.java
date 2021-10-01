package day58_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, Double> employeeMap = new HashMap<>();

        System.out.println(employeeMap);

        employeeMap.put("Vitalii", 120000.0);
        employeeMap.put("John", 123.222);
        employeeMap.put("Vitalii", 120001.0);
        employeeMap.put("Abbos", 120001.0);

        System.out.println(employeeMap.get("Abbos"));
        Double a = employeeMap.remove("Abbos");    // remove return value of the removed key

        System.out.println(employeeMap);

        employeeMap.put("Vamp", 120001.0);
        employeeMap.put("Evan", 120001.0);
        employeeMap.put("Dilan", 120001.0);
        employeeMap.put("Cooper", 120001.0);

        Double name2 = employeeMap.remove("Vamp");
        System.out.println("name2 = " + name2);

        System.out.println(employeeMap);


        boolean r1 = employeeMap.containsKey("Dilan");
        boolean r2 = employeeMap.containsKey("Abbos");

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("--------------------------------------------");

        boolean r3 = employeeMap.containsValue(120001.0);
        System.out.println("r3 = " + r3);


        employeeMap.replace("Dilan", employeeMap.get("Dilan")+ 2000);
        System.out.println("employeeMap = " + employeeMap);

        employeeMap.put("Dilan", employeeMap.get("Dilan") + 1000);
        System.out.println("employeeMap = " + employeeMap);

        System.out.println("---------------------------------------------");
        employeeMap.put("Abbos", 115000.0);
        employeeMap.put("Yuliang", 120000.0);
        employeeMap.put("Feruza", 125000.0);
        employeeMap.put("Ahmet", 129000.0);
        employeeMap.put("Ismail", 111000.0);
        employeeMap.put("Zorana", 1250000.0);
        employeeMap.put("Mehmet", 130000.0);
        employeeMap.put("Yuliia", 127005.0);
        employeeMap.put("Yasin,", 130000.0);
        employeeMap.put("Meltem", 121000.0);
        employeeMap.put("Dilem", 150000.0);
        employeeMap.put("Davut", 123000.0);
        employeeMap.put("Ekaterina", 1350000.0);
        employeeMap.put("Mehmut", 143000.0);
        employeeMap.put("Merve,", 122000.0);
        employeeMap.put("Tamara", 133000.0);

        System.out.println("_________________  keySet() ______________________________");
        int i = 0 ;
        for (String eachName : employeeMap.keySet()) {
            i++;
            System.out.println(  i +" person = " + eachName + ": " + employeeMap.get(eachName));
        }


        System.out.println("_______________________ values() __________________________");
        for (Double s : employeeMap.values()) {
            System.out.println(s);
        }


        System.out.println("_____________________-EntrySet()____________________________");
for(Map.Entry<String, Double> eachEntry: employeeMap.entrySet()){

    System.out.print("eachEntry = " + eachEntry + " , ");


    System.out.println("_ _ _ _ _ _getKey()__ getValue() _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
    System.out.println(eachEntry.getKey() + ": " + eachEntry.getValue());
    System.out.println("___________________________________________________________________");
}

        System.out.println("***************************************************************");


        double max = Double.MIN_VALUE;
        String name = "";


        for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
            String eachName = entry.getKey();
            Double eachSalary = entry.getValue();
            if(eachSalary> max){
                max = eachSalary;
                name = eachName;
            }
        }
        System.out.println(max);
        System.out.println(name );




    }


}
