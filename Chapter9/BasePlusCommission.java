//(Using Composition Rather Than Inheritance) Many programs written with inheritance
//could be written with composition instead, and vice versa. Rewrite class BasePlusCommissionEm-
//ployee (Fig. 9.11) of the CommissionEmployee – BasePlusCommissionEmployee hierarchy to use
//composition rather than inheritance.

package ir.pghnight.Chapter9;

public class BasePlusCommission {
    private String firsname;
    private String lastname;
    private String ssn;
    private double commission;
    private double gross;
    private double baseSalary;
    private double earning;


    public BasePlusCommission(String firstname, String lastname, String ssn, double gross, double commission,double baseSalary){
        this.firsname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        setGross(gross);
        setCommission(commission);
        setBaseSalary(baseSalary);
        CommissionEmployee employee = new CommissionEmployee(firstname, lastname, ssn, gross, commission);
        this.earning = earnings(getBaseSalary(), employee);
    }

    public static void main(String[] args){
        BasePlusCommission employee = new BasePlusCommission("Ali", "Deishidi", "838269", 650, 0, 900);
        System.out.print(employee.toString());
        System.out.println(employee.getBaseSalary());


    }

    public double getBaseSalary(){return this.baseSalary;}
    public double getCommission(){return this.commission;}
    public double getGross(){return this.gross;}
    public String getFirsname(){return this.firsname;}
    public String getLastname(){return this.lastname;}
    public String getSsn(){return  this.ssn;}
    public  double getEarning(){return this.earning;}

    public void setFirsname(String firsname){this.firsname = firsname;}
    public void setLastname(String lastname){this.lastname = lastname;}
    public void setSsn(String ssn){this.ssn = ssn;}
    public void setEarning(double earning){this.earning = earning;}


    public final void setCommission(double commission) {
        if (!(commission <= 1.0 && commission >= 0.0))
            throw new IllegalArgumentException("Commission must be between 0-1!");
        else
            this.commission = commission;
    }


    public void setGross(double gross) {
        if (gross < 0)
            throw new IllegalArgumentException("Gross sales cannot be negative!");
        else
            this.gross = gross;
    }


    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0)
            throw new IllegalArgumentException("Base salary cannot be negative!");
        else
            this.baseSalary = baseSalary;
    }




    public double earnings(double baseSalary, CommissionEmployee employee){
        this.earning =  employee.earnings() + getBaseSalary();
        return this.earning;
    }


    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %s%n%s: %f%n%s: %f%n%s: %f%n","first name", getFirsname(),
                "last name", getLastname(), "social security number", getSsn(), "commission", getCommission(),
                "gross", getGross(), "base salary",getBaseSalary());

    }


}
