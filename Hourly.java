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

public class Hourly extends EmployeeImplementsPayable{
    private double wage;
    private double hours;
    public Hourly(String firstName, String lastName, String SSN, double wage, double hours){
        super(firstName, lastName, SSN);
        setHours(hours);
        setWage(wage);
    }

    public final void setWage(double wage){
        if(wage < 0)
            throw  new IllegalArgumentException("Wage must be positive!");
        else
            this.wage = wage;
    }
    public final void setHours(double hours){
        if(hours < 0 || hours > 168)
            throw  new IllegalArgumentException("Hours worked must be between 0-168");
        else
            this.hours = hours;
    }
    public double getWage(){return this.wage;}
    public double getHours(){return this.hours;}
    @Override
    public String toString(){
        return String.format("%s%n%s%s: %f%n%s: %f%n", "Hourly Employee",super.toString(), "Hours Worked", getHours(), "Wage per hours", getWage());
    }

    public double earnings(){
        return getHours() > 40 ? 40 * getWage() + (getHours() % 10) * 1.5 * getWage() : getHours() * getWage();
    }
}
