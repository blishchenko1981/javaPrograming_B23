package day42_CustomClass_Constructor.CapitalOne;


public class HumanResources {
    public static Tester[] testersTeam1, testersTeam2, testersTeam3;
   public static Developer[] devopsTeam1, devopsTeam2, devopsTeam3;

    static{  // to initialize testers arrays
        testersTeam1 = new Tester[]{
                new Tester("Yuliang", 'M', "QA", 10, 110000),
                new Tester("Abbos", 'M', "SM", 11, 115000),
                new Tester("Selda", 'F', "QE", 12, 120000)
        };

        testersTeam2 = new Tester[]{
                new Tester("Feruza", 'F', "SDET", 17, 125000),
                new Tester("Ahmet", 'M', "QA", 18, 109000),
                new Tester("Muhtar", 'M', "SDET", 19, 135000),
                new Tester("Ismail", 'M', "QA", 20, 111000)
        };

        testersTeam3 = new Tester[]{
                new Tester("Sihrin", 'F', "SDET", 21, 100000),
                new Tester("Emre", 'M', "SDET", 23, 123000)
        };

    }


    static{
        devopsTeam1 = new Developer[]{
                new Developer("Zorana", 'F', "Software Developer", 13, 125000),
                new Developer("Mehmet", 'M', "JavaDeveloper", 14, 130000),
                new Developer("Yuliia", 'F', "Software Developer", 15, 125005),
                new Developer("Yasin,", 'M', "Python Developer", 16, 130000)
        };

        devopsTeam2 = new Developer[]{
                new Developer("Meltem", 'F', "Software Developer", 24, 111000),
                new Developer("Dilem", 'F', "Python Developer", 25, 160000),
                new Developer("Davut", 'M', "Java Developer", 26, 123000),
                new Developer("Ekaterina", 'F', "Software Developer", 27, 115000),
                new Developer("Memet", 'M', "Developer", 28, 153000)
        };

        devopsTeam3 = new Developer[]{
                new Developer("Merve,", 'F', "Python Developer", 30, 112000),
                new Developer("Tamara", 'F', "Software Developer", 31, 113000),
                new Developer("Christian", 'M', "Java Developer", 26, 129000)
        };



    }


}

