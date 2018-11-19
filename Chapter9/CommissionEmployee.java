
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

package ir.pghnight.Chapter9;

public class CommissionEmployee extends Employee
{
    private double gross;
    private double commissionRate;

    public CommissionEmployee(String first, String last, String ssn, double gross, double rate )
    {
        super(first, last, ssn );
        setCommissionRate(rate);
        setGross(gross);
    }

    public double getGrossSales(){return gross; }
    public double getCommissionRate() {return commissionRate;}

    public void setCommissionRate( double rate ) {
        if (!(rate < 1.0 && rate > 0.0))
            throw new IllegalArgumentException("Commission must be in range 0-1.");
        else
            commissionRate = rate;
    }


    public void setGross( double gross ){
        if(gross < 0)
            throw new IllegalArgumentException("Gross sales cannot be empty!");
        else
            this.gross = gross;
    }


    public double earnings() {return commissionRate * gross; }

    public String toString()
    {
        return String.format( "%s%s: %.2f%n%s: %.2f%n", super.toString(),"gross", getGrossSales(),
                "commission rate", getCommissionRate() );
    }
}
