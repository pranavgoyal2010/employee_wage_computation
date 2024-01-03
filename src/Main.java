public class Main {
    public static void main(String[] args){

        /**
         * This is UC6 where total monthly wage is calculated based on whether 100 hours
         * or 20 days are completed first.
         *
         * 
         * */

        int totalDays = 0;
        int totalHours = 0;
        int hourlyWage = 20;


        while(totalHours<100 && totalDays<20)
        {
            int status = (int) ((Math.random()*10)%3);

            switch (status) {
                case 0:
                    break;
                case 1:
                    int hours = 4;
                    totalHours += hours;
                    break;
                case 2:
                    hours = 8;
                    totalHours += hours;
                    break;
            }

            totalDays++;
        }

        System.out.println("Total Days: " + totalDays);

        if(totalHours<100)
        {
            System.out.println("Total Hours: " + totalHours);
            System.out.println("Employee's wages for this month: " + hourlyWage * totalHours);
        }
        else
        {
            System.out.println("Total Hours: 100");
            System.out.println("Employee's wages for this month: " + hourlyWage * 100);
        }


    }
}

