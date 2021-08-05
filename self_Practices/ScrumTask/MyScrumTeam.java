package ScrumTask;

import java.util.ArrayList;

public class MyScrumTeam {
    public static void main(String[] args) {


        Tester[] testers = {new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Vitalii", 123, "QA", 85000.5);
        testers[1].setInfo("Abbos", 122, "QA", 84000.0);
        testers[2].setInfo("John", 111, "QA", 65000);

        Developer[] developers = {new Developer(), new Developer(), new Developer()};

        developers[0].setInfo("Ksenia",001, "teamLead", 123000 );
        developers[1].setInfo("Shokhsad", 125, "Devops", 84000.0);
        developers[2].setInfo("Hende", 212, "Developer",93000);









    }
}