package ir.phgnight;

//a quick test of Employee class.

public class EmployeeTest {
    public static void main(String[] args){
        double raise;

        Employee msAlinzadeh = new Employee("Sahar", "Alizadeh", 2276.356);
        Employee mrHasanpoor = new Employee("Nima", "Hasanpoor", 2954.983);

        System.out.printf("%s %s's monthly salary: %.2f%n%s %s's monthly salary: %.2f%n",msAlinzadeh.getFirstName(), msAlinzadeh.getLastName(), msAlinzadeh.getMonthlySalary(), mrHasanpoor.getFirstName(),mrHasanpoor.getLastName(), mrHasanpoor.getMonthlySalary() );
        raise = msAlinzadeh.getMonthlySalary() * 0.1;
        msAlinzadeh.setMonthlySalary(raise + msAlinzadeh.getMonthlySalary());
        raise = mrHasanpoor.getMonthlySalary() * 0.1;
        mrHasanpoor.setMonthlySalary(raise + mrHasanpoor.getMonthlySalary());

        System.out.printf("%s %s's yearly salary: %.2f%n%s %s's salary: %.2f%n",msAlinzadeh.getFirstName(), msAlinzadeh.getLastName(), msAlinzadeh.getMonthlySalary() * 12, mrHasanpoor.getFirstName(),mrHasanpoor.getLastName(), mrHasanpoor.getMonthlySalary()*12 );

    }
}
