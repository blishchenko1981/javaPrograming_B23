package ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    int daysOFSprint;

    public void setInfo (String namePO, String nameBA, String nameSM) {
        this.PO = namePO;
        this.BA = nameBA;
        this.SM = nameSM;
    }

    public void  addTester(Tester tester){
        this.testersList.add(tester);

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

    @Override
    public String toString() {
        return
                "PO name: " + PO + '\'' +
                ", BA name: " + BA + '\'' +
                ", SM name: " + SM + '\'' +
                ", testersList=" + testersList.size() +
                ", devopsList=" + devopsList.size() ;
    }

    public void removeTester(long employeeID){
        testersList.removeIf(p-> p.employeeID== employeeID );
    }


}
