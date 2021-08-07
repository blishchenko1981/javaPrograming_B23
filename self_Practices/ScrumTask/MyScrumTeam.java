package ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {

        public static void main(String[] args) {


                Tester[] testers = {new Tester(), new Tester(), new Tester()};
                testers[0].setInfo("Vitalii", 123, "QA", 85000.5);
                testers[1].setInfo("Abbos", 122, "QA", 84000.0);
                testers[2].setInfo("John", 111, "QA", 65000);

                Developer[] developers = {new Developer(), new Developer(), new Developer()};

                developers[0].setInfo("Ksenia", 001, "teamLead", 123000);
                developers[1].setInfo("Shokhsad", 125, "Devops", 84000.0);
                developers[2].setInfo("Hende", 212, "Developer", 93000);


                Tester tester1 = new Tester();
                tester1.setInfo("JimBim", 234, "Raspisdyai", 150);
              //  testersList.addTester(tester1);

                ScrumTeam  myScrumteam = new ScrumTeam();
                myScrumteam.setInfo("Sabir","Atila","Mike");

                myScrumteam.devopsList.addAll(Arrays.asList(developers));
                myScrumteam.testersList.addAll(Arrays.asList(testers));

        }
    }
