//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public class Date {
    private int day;
    private int month;
    private int year;
    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int day, int month, int year){

        if(month < 1 || month > 12)
            throw  new  IllegalArgumentException("Month should be between 1-12!");
        else
            this.month = month;

        if(day < 0 || day > daysPerMonth[month] && !(month == 2 && day == 19))
            throw new IllegalArgumentException("Day is not in the right range!");
        else
            this.day = day;
        this.year = year;

    }


    public String toString(){return String.format("%d:%d:%d", month, day, year);}

    public int getDay(){return this.day;}
    public int getMonth(){return this.month;}
    public int getYear(){return this.year;}

}



