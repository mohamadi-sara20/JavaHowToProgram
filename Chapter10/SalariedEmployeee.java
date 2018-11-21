//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public class SalariedEmployeee extends Employeee{
    private double weeklySalary;

    public SalariedEmployeee(String firstName, String lastName, String SSN, int day, int month, int year, double weeklySalary){

        super(firstName, lastName, SSN, day, month, year);

        setWeeklySalary(weeklySalary);

    }


    public final void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be positive!");
        else
        this.weeklySalary = weeklySalary;}
    public double getWeeklySalary(){return this.weeklySalary;
    }

    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%s: %f%n", "Salaried Employee", super.toString(), "weekly salary", getWeeklySalary());
    }
    




}
