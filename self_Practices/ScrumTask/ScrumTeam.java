package ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    ArrayList<Tester> testersList = new ArrayList<>();
    ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOFSprint;

    public void setInfo (String namePO, String nameBA, String nameSM) {
        this.PO = namePO;
        this.BA = nameBA;
        this.SM = nameSM;
    }

    public ArrayList<Tester> addTester(Tester tester){
        testersList.add(tester);
        return testersList;
    }

    public ArrayList<Tester> addTesters(Tester[] testers){

        testersList.addAll(Arrays.asList(testers));

        return testersList;
    }

    public ArrayList<Developer>  addDeveloper(Developer developer){
        devopsList.add(developer);
        return devopsList;
    }

    public ArrayList<Developer> addDevelopers (Developer[] developers) {

        devopsList.addAll(Arrays.asList(developers));
        return devopsList;
    }

    public ArrayList removeTester (int employeeID){
        testersList.get(testersList.indexOf(Tester.))
   testersList.remove(Tester tester.employeeID)
    }


}
