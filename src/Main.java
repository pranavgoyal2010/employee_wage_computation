public class Main {
    public static void main(String[] args){

        /**
         * This is UC 5 where total monthly wage is calculated.
         *
         * It includes UC 1, UC 2, UC 3 and UC 4
         * */

        
        int totalWage = 0;
        int hourlyWage = 20;
        int days = 20;
        int hours = 0;
        for(int i=1; i<=days; i++)
        {
            int status = (int) ((Math.random()*10)%3);
            switch (status) {
                case 0:
                    System.out.println("Employee is Absent");
                    System.out.println("Total daily wage is: 0");
                    break;
                case 1:
                    System.out.println("Employee is Present");
                    hours = 4;
                    System.out.println("Part time total daily wage is: " + hourlyWage * hours);
                    break;
                case 2:
                    System.out.println("Employee is Present");
                    hours = 8;
                    System.out.println("Full time total daily wage is: " + hourlyWage * hours);
                    break;
            }

            totalWage += hourlyWage*hours;
        }

        System.out.println("Employee's total monthly wage: "+totalWage);
    }
}

