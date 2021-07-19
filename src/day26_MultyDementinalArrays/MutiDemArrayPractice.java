package day26_MultyDementinalArrays;

public class MutiDemArrayPractice {
    public static void main(String[] args) {
        String[][] cyberTekGroups = {{"Ahmed", "Ahmet", "Igor", "Andrei", "Mykyta"},
                {"Sabir", "Abbos", "Kseniia", "Vitalii", "Merve", "Atila", "Shokhzod", "Hende", "Serife", "Collins", "Akangankoy", "Liubov"},
                {"Oz", "Ibrahim", "Davut", "Dontrell", "Muahmmed"},
                {"Inesa", "Aysu", "Suat", "Esra", "Yusuf", "Mohamed", "Tinbite", "Raphael"},
                {"Selda", "Ibrahim", "Tamerlan", "Mehmut", "Sina"}
        };

        int count = 0;
        for (String[] eachGroup : cyberTekGroups) {
            for (String eachName: eachGroup){
                if(eachName.equals("Ahmet")){
                    count++ ;
                }
            }

        }
        System.out.println(count);

    }
}
