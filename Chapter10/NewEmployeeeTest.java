// (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
//additional Employee subclass PieceWorker that represents an employee whose pay is based on the
//number of pieces of merchandise produced. Class PieceWorker should contain private instance
//variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
//produced). Provide a concrete implementation of method earnings in class PieceWorker that cal-
//culates the employee’s earnings by multiplying the number of pieces produced by the wage per
//piece. Create an array of Employee variables to store references to objects of each concrete class in
//the new Employee hierarchy. For each Employee, display its String representation and earnings.


package JavaHowToProgram.Chapter10;

public class NewEmployeeeTest {
    public static double earning = 0.0;
    public static String todayDate = "21:11";

    public static void main(String[] args) {
        SalariedEmployeee salariedEmployeee = new SalariedEmployeee("Mat", "Sepahi", "462027", 20, 6, 1978, 1000);
        HourlyEmployeee hourlyEmployeee = new HourlyEmployeee("Saman", "Mo", "469275", 14, 2, 1990, 70, 900);
        CommissionEmployeee commissionEmployeee = new CommissionEmployeee("Milad", "Mo", "23452", 21, 11, 1992, 1000, 0.1);
        BasePlusCommissionEmployeee basePlusCommissionEmployeee = new BasePlusCommissionEmployeee("Ehsan", "Alinejad", "3456", 18, 12, 1991, 900, 0.15, 600);
        PieceWorker pieceWorker = new PieceWorker("Sara", "Shahmohamadi", "4567", 21, 11, 1994, 90, 5);


        Employeee[] employees = new Employeee[5];
        employees[0] = salariedEmployeee;
        employees[1] = hourlyEmployeee;
        employees[2] = commissionEmployeee;
        employees[3] = basePlusCommissionEmployeee;
        employees[4] = pieceWorker;

        for(Employeee employeee: employees){
            System.out.print(employeee.toString());
            System.out.printf("%s: %f%n%n%n", "earned", employeee.earnings());

        }
    }
}

