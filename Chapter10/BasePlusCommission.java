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

public class BasePlusCommission extends Commission{

    private double baseSalary;

    public BasePlusCommission(String first, String last, String ssn, double gross, double commissionRate, double baseSalary){
        super(first, last, ssn, gross, commissionRate);
        setBaseSalary(baseSalary);
    }


    public double getBaseSalary(){return this.baseSalary;}
    public final void setBaseSalary(double baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary cannot be negative!");
        else
            this.baseSalary = baseSalary;
    }

    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString(){
        return String.format("%s%s: %f%n", super.toString(), "base salary", getBaseSalary());
    }

}

