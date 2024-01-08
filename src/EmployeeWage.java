/**
 * This is UC7 where total monthly wage is calculated based on whether 100 hours
 * or 20 days are completed first.
 *
 * Here the class is defined which has class variables and class methods.
 *
 * */
public class EmployeeWage {
    private int totalDays;
    private int totalHours;
    private int hourlyWage;
    private int maxDays;
    private int maxHours;

    public EmployeeWage(int hourlyWage, int maxDays, int maxHours){
        this.totalDays = 0;
        this.totalHours = 0;
        this.hourlyWage = hourlyWage;
        this.maxDays = maxDays;
        this.maxHours = maxHours;
    }

    public void computeDisplayWage(){
        while(this.totalHours<maxHours && this.totalDays<maxDays)
        {
            int status = (int) ((Math.random()*10)%3);

            switch (status) {
                case 0:
                    break;
                case 1:
                    int hours = 4;
                    this.totalHours += hours;
                    break;
                case 2:
                    hours = 8;
                    this.totalHours += hours;
                    break;
            }

            this.totalDays++;
        }

        System.out.println("Total Days: " + this.totalDays);

        if(this.totalHours<this.maxHours)
        {
            System.out.println("Total Hours: " + this.totalHours);
            System.out.println("Employee's wages for this month: " + this.hourlyWage * this.totalHours);
        }
        else
        {
            System.out.println("Total Hours: " + this.maxHours);
            System.out.println("Employee's wages for this month: " + this.hourlyWage * this.maxHours);
        }

    }
}
