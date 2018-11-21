//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public class BasePlusCommissionEmployeee extends CommissionEmployeee{

    private double baseSalary;

    public BasePlusCommissionEmployeee(String first, String last, String ssn, int day, int month, int year, double gross, double commissionRate, double baseSalary){
        super(first, last, ssn,day, month, year, gross, commissionRate);
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
    public double earnings() {
        return super.earnings() + getBaseSalary();
    }

    @Override
    public String toString(){
        return String.format("%s%s: %f%n", super.toString(), "base salary", getBaseSalary());
    }

}


