
//(Creating a New Subclass of Employee) Other types of Employees might include Salaried-
//Employees
// who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
//they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
//hourly wage—for hours worked over 40 hours.
//Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
//instance variable hours (a double) that represents the hours worked, instance variable wage (a dou-
//ble) that represents the wages per hour, a constructor that takes as arguments a first name, a last
//name, a social security number, an hourly wage and the number of hours worked, set and get meth-
//ods for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
//earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
//String representation. Method setWage should ensure that wage is nonnegative, and setHours
//should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
//Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.

package ir.pghnight;

public class HourlyEmployee extends Employee
{
    private double hour;
    private double wagePerHour;

    public HourlyEmployee(String first, String last, String ssn, double hour, double wagePerHour){

        super(first, last, ssn);
        setHour(hour);
        setWagePerHour(wagePerHour);
    }

    public double getHour(){return this.hour;}
    public double getWagePerHour(){return wagePerHour;}


    public void setHour(double hour) {
        if(!(hour >= 0 && hour <= 168))
            throw new IllegalArgumentException("Hour cannot be less than zero and more than 168!");
        else
            this.hour = hour;
    }


    public void setWagePerHour(double wagePerHour){
        if(wagePerHour > 0)
            this.wagePerHour = hour;

        else
            throw new IllegalArgumentException("Wage must be positive!");
    }


    public double earnings() {
        return hour > 40 ? 40 * wagePerHour + (hour % 10) * 1.5 * wagePerHour : hour * wagePerHour;
    }


    @Override
    public String toString(){
        return String.format("%s%s: %s%n%s: %s", super.toString(),"Wage per hour", getWagePerHour(), "Hour", getHour());
    }

    public static void main(String[] args){
        HourlyEmployee mas = new HourlyEmployee("masoomeh", "zamani", "48161", 0, 7);
        System.out.println(mas.toString());

        System.out.println(mas.earnings());
        mas.setHour(168);
        System.out.println(mas.toString());


    }


}
