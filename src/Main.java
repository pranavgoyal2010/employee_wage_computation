public class Main {
    public static void main(String[] args){

        /**
         * This is UC 5 where total monthly wage is calculated.
         *
         * It includes UC 1, UC 2, UC 3 and UC 4
         * */


        int status = (int) ((Math.random()*10)%3);

        System.out.println("Employee Status: "+status);

        int hourlyWage = 20;
        int days = 20;

        switch (status) {
            case 0:
                System.out.println("Employee is Absent");
                System.out.println("Total daily wage is: 0");
                break;
            case 1:
                System.out.println("Employee is Present");
                int hours = 4;
                System.out.println("Part time total monthly wage is: " + hourlyWage * hours * days);
                break;
            case 2:
                System.out.println("Employee is Present");
                hours = 8;
                System.out.println("Full time total monthly wage is: " + hourlyWage * hours * days);
                break;
        }

    }
}

