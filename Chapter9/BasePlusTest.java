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

public class BasePlusTest {

    public static void main(String[] args){

        //Initialize an base plus commission employee and display the result.
        BasePlus mat = new BasePlus("Mat", "Sepah", "563", 1000, 0.05, 900);
        System.out.print(mat.toString());
        System.out.println();

        //Modify variables initialized in super class and the base plus class itself and see if the results are applied.
        mat.setBaseSalary(950);
        mat.setCommissionRate(0.2);
        mat.setGross(800);
        mat.setLastName("Sepahi");

        System.out.print(mat.toString());
        System.out.println();

        double earning = mat.earnings();

        System.out.printf("Mat gets %.2f this month!", earning);
        System.out.println();


    }



}
