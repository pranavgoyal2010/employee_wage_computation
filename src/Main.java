public class Main {
    public static void main(String[] args){

        /**
         * This is UC 3 where we compute the total daily wage of the employee based on if
         * the employee is present or absent and if present is the employee full time
         * or part time employee.
         *
         * UC 3 includes UC 1 and UC 2
         * */


        int status = (int) ((Math.random()*10)%3);

        System.out.println("Employee Status: "+status);

        int hourlyWage = 20;
        if(status==0)
        {
            System.out.println("Employee is Absent");
            System.out.println("Total daily wage is: 0");
        }
        else
        {
            System.out.println("Employee is Present");
            if(status==1)
            {
                int hours = 4;
                System.out.println("Part time total daily wage is: " + hourlyWage*hours);
            }
            else
            {
                int hours = 8;
                System.out.println("Full time total daily wage is: " + hourlyWage*hours);
            }
        }
    }
}

