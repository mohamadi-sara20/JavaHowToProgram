//(Employee Hierarchy) In this chapter, you studied an inheritance hierarchy in which class
//BasePlusCommissionEmployee
// inherited from class CommissionEmployee. However, not all types of
//employees are CommissionEmployee s. In this exercise, you’ll create a more general Employee superclass
//that factors out the attributes and behaviors in class CommissionEmployee that are common to all Em-
//ployees. The common attributes and behaviors for all Employees are firstName, lastName, socialSe-
//curityNumber, getFirstName, getLastName , getSocialSecurityNumber and a portion of method
//toString. Create a new superclass Employee that contains these instance variables and methods and a
//constructor. Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Employee.
//Class CommissionEmployee should contain only the instance variables and methods that are not de-
//clared in superclass Employee. Class CommissionEmployee’s constructor should invoke class Employee’s
//constructor and CommissionEmployee’s toString method should invoke Employee’s toString method.
//Once you’ve completed these modifications, run the CommissionEmployeeTest and BasePlusCommis-
//sionEmployeeTest apps using these new classes to ensure that the apps still display the same results for
//a CommissionEmployee object and BasePlusCommissionEmployee object, respectively.


package ir.pghnight.Chapter9;

public class BasePlus extends CommissionEmployee
{
    private double baseSalary;

    public BasePlus(String first, String last, String ssn, double gross, double commissionRate, double baseSalary){
        super(first, last, ssn, gross, commissionRate);
        setBaseSalary(baseSalary);
    }


    public double getBaseSalary(){return this.baseSalary;}
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary cannot be negative!");
        else
            this.baseSalary = baseSalary;}

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s%s: %f%n", super.toString(), "base salary", getBaseSalary());
    }

}
