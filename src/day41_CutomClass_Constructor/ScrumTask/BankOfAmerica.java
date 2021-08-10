package day41_CutomClass_Constructor.ScrumTask;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Vitalii Blishchenko", "qa", 'm', 150000);
        Tester tester2 = new Tester("Jingle", "SDET", 'm', 75000);
        Tester tester3 = new Tester("Julia", "qa leader", 'f', 195000);
        Tester tester4 = new Tester("Bimbo Juice", "qa junior", 'm', 35000);

        Tester[] testers = {tester2, tester3, tester4};

        Developer developer1 = new Developer("Sabir", "developer", 'm', 150000);
        Developer developer2 = new Developer("Ashotya", "developer", 'f', 120000);
        Developer developer3 = new Developer("Kseniia", "developer", 'f', 78000);
        Developer developer4 = new Developer("Abbos", "developer", 'm', 50000);
        Developer developer5 = new Developer("Shokzad", "developer", 'm', 860000);

        Developer[] developers = {developer2, developer3, developer4, developer5};

        ScrumTeam scrum1 = new ScrumTeam("mr.Curtings", "Anna", "Jane");
        scrum1.hireTester(tester1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developer1);
        scrum1.hireDeveloper(developers);
        System.out.println(scrum1);
        System.out.println(scrum1.developersList);
        System.out.println(scrum1.testersList);

        double budget = 0;
        for (Tester eachTester : scrum1.testersList) {
            budget += eachTester.salary;
        }

        for (Developer eachDev : scrum1.developersList) {
            budget += eachDev.salary;
        }

        System.out.println(budget + "$ is a  Budget for team");
        System.out.println("-------------------------------------------");

        ScrumTeam scrum2 = new ScrumTeam("mr.Potter", "Rocky Bolboa", "Sara Conor");
        ScrumTeam scrum3 = new ScrumTeam("Putin", "Clinton", "Trump");

        Tester tester5 = new Tester("Tim Cook", "qa", 'm', 150000);
        Tester tester6 = new Tester("Bil Gueits", "SDET", 'm', 75000);
        Tester tester7 = new Tester("Julia Roberts", "qa leader", 'f', 175000);
        Tester tester8 = new Tester(" Juicy Pam", "qa junior", 'm', 3500);
        Tester tester9 = new Tester("Arnold Sh.", "qa junior", 'm', 35000);

        Tester[] testers2 = {tester5, tester6, tester7, tester8, tester9};

        Developer developer6 = new Developer("Lenin", "developer", 'm', 150003);
        Developer developer7 = new Developer("Steve Jobs", "developer", 'f', 120054);
        Developer developer8 = new Developer("Kartoon", "developer", 'f', 78034);
        Developer developer9 = new Developer("Andrew", "coder", 'm', 50076);
        Developer developer10 = new Developer("Ali Baba", "devLeder", 'm', 86045);
        Developer developer11 = new Developer("Ali Express", "developer", 'm', 86045);

        Developer[] developers2 = {developer6, developer7, developer8, developer9, developer10, developer11};

        scrum2.hireTester(testers2);
        scrum2.hireDeveloper(developers2);
        System.out.println(scrum2);
        System.out.println("-------------------------------------------");

        Tester tester10 = new Tester("Timberly Sun", "qa", 'f', 183450);
        Tester tester11 = new Tester("Kim Bassinger", "SDET", 'f', 75980);

        Tester[] testers3 = {tester10, tester11};

        Developer developer12 = new Developer("Jannifer Lopes", "developer", 'f', 78034);
        Developer developer13 = new Developer("Andrew Kuomo", "coder", 'm', 50076);
        Developer developer14 = new Developer("Jasmin", "devLeder", 'm', 8005);
        Developer developer15 = new Developer("Alladin", "developer", 'm', 120045);

        Developer[] developers3 = {developer12, developer13, developer14, developer15};

        scrum3.hireDeveloper(developers3);
        scrum3.hireTester(testers3);
        System.out.println(scrum3);
        System.out.println("--------------------------------------------------------");

        ScrumTeam[] scrumTeams = {scrum1, scrum2, scrum3};
        //1. Total budget in BofA:

        double totalBudget = 0;
        for (ScrumTeam scrumTeam : scrumTeams) {
            for (Developer developer : scrumTeam.developersList) {
                totalBudget += developer.salary;
            }
            for (Tester tester : scrumTeam.testersList) {
                totalBudget += tester.salary;
            }
        }

        System.out.println("1) totalBudget = " + totalBudget);


        //2. total Testers:
        int totalTesters = 0;

        for (ScrumTeam scrumTeam : scrumTeams) {
            totalTesters += scrumTeam.testersList.size();
        }
        System.out.println("2) TotalTesters = " + totalTesters);
        //3. Total number of developers in Bank of America;

        int totalDevs = 0;

        for (ScrumTeam scrumTeam : scrumTeams) {
            totalDevs += scrumTeam.developersList.size();
        }
        System.out.println("3) Total Developers = " + totalDevs);

        //4. What is the max & min salaries of the testers

        double minSalaryTesters = scrumTeams[0].testersList.get(0).salary;
        double maxSalaryTesters = Double.MIN_VALUE;
        String t1 = "", t2 = "",d1 = "", d2 = "";

        for (ScrumTeam scrumTeam : scrumTeams) {
            for (Tester tester : scrumTeam.testersList) {
                if (tester.salary < minSalaryTesters) {
                    minSalaryTesters = tester.salary;
                    t1 = tester.name;
                }

                if (tester.salary > maxSalaryTesters) {
                    maxSalaryTesters = tester.salary;
                    t2= tester.name;
                }
            }


        }
        System.out.println("4) max Salary for testers  = $" + maxSalaryTesters + t2);
        System.out.println("   min Salary for testers  = $" + minSalaryTesters+ t1);


        //5. what's the max & min salaries of the developers

        double maxSalaryDev = scrumTeams[0].developersList.get(0).salary;
        double minSalaryDev = developer1.salary;

        for (ScrumTeam scrumTeam : scrumTeams) {
            for (Developer developer : scrumTeam.developersList) {
                if (developer.salary > maxSalaryDev) {
                    maxSalaryDev = developer.salary;
                    d1= developer.name;
                }

                if (developer.salary < minSalaryDev) {
                    minSalaryDev = developer.salary;
                    d2= developer.name;
                }
            }
        }


        System.out.println("5) min Salary for Developers = $" + minSalaryDev + "==>"+ d2);
        System.out.println("   max Salary for Developers = $" + maxSalaryDev+ "==>"+ d1);


    }
}
