public class Company {
    private EmployeeWage employeeWage;
    private String name;
    //private int maxHours;
    //private int maxDays;
    //private int hourlyWage;

    public Company(int maxHours, int maxDays, int hourlyWage, String name) {
        this.employeeWage = new EmployeeWage(hourlyWage, maxDays, maxHours);
        this.name = name;
    }

    public void display()
    {
        System.out.println("Company Name: " + this.name);
        this.employeeWage.computeDisplayWage();
    }
}
