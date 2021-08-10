package day41_CutomClass_Constructor.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersList;
    public ArrayList<Developer> developersList;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testersList = new ArrayList<>();
        developersList = new ArrayList<>();


    }

    public String toString() {
        return "ScrumTeam{" +
                "PO= '" + PO + '\'' +
                ", BA= '" + BA + '\'' +
                ", SM= '" + SM + '\'' +
                ", testersList=" + testersList.size() +
                ", developersList=" + developersList.size() +
                '}';
    }

    public void hireTester(Tester tester){
        testersList.add(tester);

    }
    public void hireTester(Tester [] testers){
        testersList.addAll(Arrays.asList(testers));

    }
    public void removeTester(String name){
        testersList.removeIf(p->p.name.equals(name));
    }

    public void hireDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void hireDeveloper(Developer [] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeDeveloper(String name){
        developersList.removeIf(p -> p.name.equals(name));
    }

}
