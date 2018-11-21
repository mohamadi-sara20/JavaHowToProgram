// (Accounts Payable System Modification) In this exercise, we modify the accounts payable
//application of Figs. 10.11–10.15 to include the complete functionality of the payroll application of
//Figs. 10.4–10.9. The application should still process two Invoice objects, but now should process
//one object of each of the four Employee subclasses. If the object currently being processed is a Base-
//PlusCommissionEmployee, the application should increase the BasePlusCommissionEmployee’s base
//salary by 10%. Finally, the application should output the payment amount for each object. Com-
//plete the following steps to create the new application:
//a) Modify classes HourlyEmployee (Fig. 10.6) and CommissionEmployee (Fig. 10.7) to place
//them in the Payable hierarchy as subclasses of the version of Employee (Fig. 10.13) that
//implements Payable. [Hint: Change the name of method earnings to getPaymentAmount
//in each subclass so that the class satisfies its inherited contract with interface Payable.]
//b) Modify class BasePlusCommissionEmployee (Fig. 10.8) such that it extends the version
//of class CommissionEmployee created in part (a).
//c) Modify PayableInterfaceTest (Fig. 10.15) to polymorphically process two Invoices,
//one SalariedEmployee, one HourlyEmployee, one CommissionEmployee and one Base-
//PlusCommissionEmployee. First output a String representation of each Payable object.
//Next, if an object is a BasePlusCommissionEmployee, increase its base salary by 10%. Fi-
//nally, output the payment amount for each Payable object.

package JavaHowToProgram.Chapter10;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn, double gross, double commissionRate, double baseSalary){
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

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + getBaseSalary();
    }

    @Override
    public String toString(){
        return String.format("%s%s: %f%n", super.toString(), "base salary", getBaseSalary());
    }

}