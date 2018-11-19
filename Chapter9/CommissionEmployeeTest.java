
//(Creating a New Subclass of Employee) Other types of Employees might include Salaried-
//Employees
// who get paid a fixed weekly salary, PieceWorkers who get paid by the number of pieces
//they produce or HourlyEmployees who get paid an hourly wage with time-and-a-half—1.5 times the
//hourly wage—for hours worked over 40 hours.
//Create class HourlyEmployee that inherits from class Employee (Exercise 9.14) and has
//instance variable hours (a double) that represents the hours worked, instance variable wage (a dou-
//ble) that represents the wages per hour, a constructor that takes as arguments a first name, a last
//name, a social security number, an hourly wage and the number of hours worked, set and get meth-
//ods for manipulating the hours and wage, an earnings method to calculate an HourlyEmployee’s
//earnings based on the hours worked and a toString method that returns the HourlyEmployee’s
//String representation. Method setWage should ensure that wage is nonnegative, and setHours
//should ensure that the value of hours is between 0 and 168 (the total number of hours in a week).
//Use class HourlyEmployee in a test program that’s similar to the one in Fig. 9.5.

package ir.pghnight.Chapter9;

public class CommissionEmployeeTest {

    public static void main(String[] args){

        CommissionEmployee employee = new CommissionEmployee("sara", "shahmohamadi", "7577381", 600, 0.01);
        System.out.print(employee.toString());
        System.out.println();

        //Modifying the information.
        employee.setFirstName("Sara");
        employee.setLastName("Shahmohamadi");
        employee.setSocialSecurityNumber("3577281");
        employee.setGross(720);


        //Check to see if the changes are applied.
        System.out.print(employee.toString());




    }
}
