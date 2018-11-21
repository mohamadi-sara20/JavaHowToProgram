//(Accounts Payable System Modification) It’s possible to include the functionality of the pay-
//roll application (Figs. 10.4–10.9) in the accounts payable application without modifying Employee
//subclasses SalariedEmployee, HourlyEmployee, CommissionEmployee or BasePlusCommission-
//Employee. To do so, you can modify class Employee (Fig. 10.4) to implement interface Payable and
//declare method getPaymentAmount to invoke method earnings. Method getPaymentAmount would
//then be inherited by the subclasses in the Employee hierarchy. When getPaymentAmount is called for
//a particular subclass object, it polymorphically invokes the appropriate earnings method for that
//subclass. Reimplement Exercise 10.15 using the original Employee hierarchy from the payroll appli-
//cation of Figs. 10.4–10.9. Modify class Employee as described in this exercise, and do not modify any
//of class Employee’s subclasses.
package JavaHowToProgram.Chapter10;

public class Commission extends EmployeeImplementsPayable{

    private double gross;
    private double commissionRate;

    public Commission(String first, String last, String ssn, double gross, double rate)
    {
        super(first, last, ssn);
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

    public double earnings() {return getCommissionRate() * getGrossSales(); }

    public String toString()
    {
        return String.format( "%s%s: %.2f%n%s: %.2f%n", super.toString(),"gross", getGrossSales(),
                "commission rate", getCommissionRate() );
    }
}
