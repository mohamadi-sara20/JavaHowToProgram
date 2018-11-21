//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public class EmployeeeTest {
    public String todayDate = "11-21";
    public static double earning = 0.0;

    public static void main(String[] args) {
        SalariedEmployeee salariedEmployeee = new SalariedEmployeee("Mat", "Sepahi", "462027", 20, 6, 1978, 1000);
        HourlyEmployeee hourlyEmployeee = new HourlyEmployeee("Saman", "Mo", "469275", 14, 2, 1990, 70, 900);
        CommissionEmployeee commissionEmployeee = new CommissionEmployeee("Milad", "Mo", "23452", 21, 11, 1992, 1000, 0.1);
        BasePlusCommissionEmployeee basePlusCommissionEmployeee = new BasePlusCommissionEmployeee("Ehsan", "Alinejad", "3456", 18, 12, 1991, 900, 0.15, 600);



        Employeee[] employees = new Employeee[4];

        employees[0] = salariedEmployeee;
        employees[1] = hourlyEmployeee;
        employees[2] = commissionEmployeee;
        employees[3] = basePlusCommissionEmployeee;

        for(Employeee employeee: employees){
            if((employeee.getBirthday().equals("6:20"))) {
                System.out.printf("%s %s gets a bonus because today is his birthday!%n", employeee.getFirstName(), employeee.getLastName());
                earning = employeee.earnings() + 100;
            }
            else
                earning = employeee.earnings();

            System.out.print(employeee.toString());
            System.out.printf("earned: %f%n%n%n", earning);



        }









    }


}