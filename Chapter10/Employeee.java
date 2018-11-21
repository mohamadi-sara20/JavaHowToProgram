//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public abstract class Employeee{
    private String firstName;
    private String lastName;
    private String SSN;
    private Date birthDate;

    public Employeee(String firstName, String lastName, String SSN, int day, int month, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.birthDate = new Date(day,month, year);

    }


    public String getFirstName(){return  this.firstName;}
    public String getLastName(){return this.lastName;}
    public String getSSN(){return  this.SSN;}

    public String getBirthday(){return String.format("%d:%d", birthDate.getMonth(), birthDate.getDay()); }

    public final void setFirstName(String firstName){this.firstName = firstName;}
    public final void setLastName(String lastName){this.lastName = lastName;}
    public final void setSSN(String SSN){this.SSN = SSN;}

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n" , "first name", firstName, "last name", getLastName(), "social security number", getSSN());
    }

    public abstract double earnings();
}

