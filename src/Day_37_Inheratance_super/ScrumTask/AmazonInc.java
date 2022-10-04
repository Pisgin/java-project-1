package Day_37_Inheratance_super.ScrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner PO = new ProductOwner("Muhammed" , 30 , 'M' , 3803 , "SDET" , 15000 , company);

        BusinessAnalyst BA = new BusinessAnalyst("Oguz" , 25 , 'M' , 3412 , "Developer" , 16000 , company);

        ScrumMaster SM = new ScrumMaster("Zülal" , 28 , 'F' , 1108 , "Devops" , 12000 , company);


        Tester tester1 = new Tester("Sukru" , 29 , 'M' , 3714 , "QA" , 19000 ,company);

        Tester tester2 = new Tester("Muhammed" , 30 , 'M' , 3803 , "QE" , 19500 ,company);

        Tester tester3 = new Tester("Mustafa" , 28 , 'M' , 3016 , "SDET" , 19200 ,company);

        Tester tester4 = new Tester("Oguz" , 27 , 'M' , 3414 , "QA" , 19800 ,company);

        Tester [] testers = { tester1 , tester2 , tester3 , tester4 };

        Developer developer1 = new Developer( "Selcuk" , 31 , 'M' , 3812 , "Java Developer" , 20000 , company);

        Developer developer2 = new Developer( "Ertugrul" , 32 , 'M' , 3408 , "Java Developer" , 23000 , company);

        Developer developer3 = new Developer( "Yakup" , 33 , 'M' , 3423 , "Java Developer" , 21000 , company);

        Developer developer4 = new Developer( "Muhtar" , 30 , 'M' , 1199 , "Java Developer" , 25000 , company);

        Developer developer5 = new Developer( "Asiya" , 32 , 'F' , 1188, "Java Developer" , 22000 , company);

        ScrumTeam scrumTeam = new ScrumTeam( PO , BA , SM );

        Developer[] developers = { developer1 ,developer2 ,developer3 ,developer4 , developer5};

        scrumTeam.addDevelopers(developers);

        scrumTeam.addTesters( testers );

        System.out.println(scrumTeam);

        System.out.println("---------------------------------------------------------------");

        for (Tester tester : scrumTeam.testers ) {
            System.out.println("tester = " + tester);
        }

        System.out.println("---------------------------------------------------------------");

        for ( Tester tester : scrumTeam.testers ) {
            System.out.println(tester.name + "  :  " + tester.salary );
        }

        System.out.println("---------------------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer);
        }
        System.out.println("--------------------------------------------------");

        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name + "  :  "+ developer.salary );
        }
    }
}
