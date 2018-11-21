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


public class PayableInterfaceTest
{
    double earning = 0.0;
    public static void main(String[] args)

    {
        Payable[] payableObjects = new Payable[7];

        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Barnes",  "888-88-8888", 1200.00);
        payableObjects[4] = new CommissionEmployee("Sara", "Shahmohamadi", "34567876543", 800, 0.9);
        payableObjects[5] = new BasePlusCommissionEmployee("Ali", "Yeralma", "0985631", 1000, 0.9, 600);
        payableObjects[6] = new HourlyEmployee("Amin", "Amani", "238407", 10, 53);


        System.out.println("Invoices and Employees processed polymorphically:");

        for (Payable currentPayable : payableObjects) {
            if(currentPayable instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
                employee.setBaseSalary(employee.getBaseSalary() + employee.getBaseSalary() * 0.1);
            }

            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}

