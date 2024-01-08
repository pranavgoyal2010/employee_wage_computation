import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /**
         * This is UC8 where total monthly wage is calculated foe each company.
         * user input is take for company name, number of hours, number of days
         * and hourly wage.
         *
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER\n1. TO ENTER COMPANY DETAILS AND PRINT EMPLOYEE\'S WAGE\n2. TO EXIT");

        int choice = sc.nextInt();


        while(choice==1){
            sc.nextLine();
            System.out.println("Enter company name");
            String companyName = sc.nextLine();
            System.out.println("Enter hourly wage");
            int hourlyWage = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter maximum hours");
            int maxHours = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter maximum working days");
            int maxDays = sc.nextInt();
            sc.nextLine();


            Company company = new Company(maxHours, maxDays, hourlyWage, companyName);

            company.display();


            System.out.println("======================================================");
            System.out.println("ENTER\n1. TO ENTER COMPANY DETAILS AND PRINT EMPLOYEE\'S WAGE\n2. TO EXIT");
            choice = sc.nextInt();
        }


    }
}

