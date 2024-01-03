public class Main {
    public static void main(String[] args){

        /**
         *
         *  This is the UC 1 where we check if an employee is present or absent.
         *
         */
        int status = (int) ((Math.random()*10)%2);

        if(status==1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");


        /**
         * This is UC 2 where we compute the total daily wage of the employee.
         * */

        int hourlyWage = 20;
        if(status==1) {
            int numOfHours = 8;
            int totalWage = hourlyWage * numOfHours;
            System.out.println("Total Daily Wage: " + totalWage);
        }
        else {
            int totalWage = 0;
            System.out.println("Total Daily Wage: " + totalWage);
        }

    }
}

