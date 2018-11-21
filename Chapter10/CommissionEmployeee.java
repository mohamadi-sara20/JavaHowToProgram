//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public class CommissionEmployeee extends Employeee{

    private double gross;
    private double commissionRate;

    public CommissionEmployeee(String first, String last, String ssn, int day, int month, int year, double gross, double rate )
    {
        super(first, last, ssn, day, month, year);
        setCommissionRate(rate);
        setGross(gross);
    }

    public final double getGrossSales(){return gross; }
    public final double getCommissionRate() {return commissionRate;}

    public final void setCommissionRate( double rate ) {
        if (!(rate < 1.0 && rate > 0.0))
            throw new IllegalArgumentException("Commission must be in range 0-1.");
        else
            commissionRate = rate;
    }


    public final void setGross( double gross ){
        if(gross < 0)
            throw new IllegalArgumentException("Gross sales cannot be empty!");
        else
            this.gross = gross;
    }

    @Override
    public double earnings() {return getCommissionRate() * getGrossSales(); }

    public String toString()
    {
        return String.format( "%s%s: %.2f%n%s: %.2f%n", super.toString(),"gross", getGrossSales(),
                "commission rate", getCommissionRate() );
    }
}
