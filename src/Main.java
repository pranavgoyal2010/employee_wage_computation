public class Main {
    public static void main(String[] args){

        /**
         * This is UC7 where total monthly wage is calculated based on whether 100 hours
         * or 20 days are completed first.
         *
         * Here the object of the class is created and its
         * member functions are called to compute and display the wage.
         * */


        EmployeeWage employeeWage = new EmployeeWage(20);
        employeeWage.computeDisplayWage();

    }
}

