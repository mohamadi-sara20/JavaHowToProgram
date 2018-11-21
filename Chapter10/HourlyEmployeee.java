//(Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include pri-
//vate instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an em-
//ployee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
//Create an array of Employee variables to store references to the various employee objects. In a loop,
//calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
//payroll amount if the current month is the one in which the Employee’s birthday occurs.

package JavaHowToProgram.Chapter10;

public class HourlyEmployeee extends Employeee{
        private double wage;
        private double hours;

         public HourlyEmployeee(String firstName, String lastName, String SSN, int day, int month, int year, double hours, double wage){

            super(firstName, lastName, SSN, day, month, year);
            setHours(hours);
            setWage(wage);



        }


        public final void setWage(double wage){
             if(wage < 0)
                 throw  new IllegalArgumentException("Wage must be positive!");
             else
                 this.wage = wage;
        }


        public final void setHours(double hours){
             if(hours < 0 || hours > 168)
                 throw  new IllegalArgumentException("Hours worked must be between 0-168");
             else
                 this.hours = hours;
        }


        public double getWage(){return this.wage;}
        public double getHours(){return this.hours;}


        @Override
        public String toString(){
             return String.format("%s%n%s%s: %f%n%s: %f%n", "Hourly Employee",super.toString(), "Hours Worked", getHours(), "Wage per hours", getWage());
        }

        @Override
        public double earnings(){
            return getHours() > 40 ? 40 * getWage() + (getHours() % 10) * 1.5 * getWage() : getHours() * getWage();
        }



    }
