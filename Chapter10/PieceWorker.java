// (Payroll System Modification) Modify the payroll system of Figs. 10.4–10.9 to include an
//additional Employee subclass PieceWorker that represents an employee whose pay is based on the
//number of pieces of merchandise produced. Class PieceWorker should contain private instance
//variables wage (to store the employee’s wage per piece) and pieces (to store the number of pieces
//produced). Provide a concrete implementation of method earnings in class PieceWorker that cal-
//culates the employee’s earnings by multiplying the number of pieces produced by the wage per
//piece. Create an array of Employee variables to store references to objects of each concrete class in
//the new Employee hierarchy. For each Employee, display its String representation and earnings.


package JavaHowToProgram.Chapter10;

public class PieceWorker extends Employeee{
    private double wagePerPiece;
    private int piece;

    public PieceWorker(String firstName, String lastName, String SSN,  int day, int month, int year, int piece, double wagePerPiece){
        super(firstName, lastName, SSN, day, month, year);
        setPiece(piece);
        setWagePerPiece(wagePerPiece);

    }


    public final void setWagePerPiece(double wagePerPiece){
        if(wagePerPiece <= 0)
            throw new IllegalArgumentException("Wage per price cannot be negative!");
        else
            this.wagePerPiece = wagePerPiece;
    }

    public final void setPiece(int piece){
        if(piece <= 0)
            throw new IllegalArgumentException("Number of pieces cannot be negative!");
        else
            this.piece = piece;
    }

    public double getWagePerPiece(){return this.wagePerPiece;}
    public int getPiece(){return piece;}

    @Override
    public double earnings(){return getPiece() * getWagePerPiece();}

    @Override
    public String toString(){
        return String.format("%s%n%s%s: %d%n%s %f%n", "Piece Worker", super.toString(), "Pieces Delivered", getPiece(), "Wage per piece", getWagePerPiece());
    }


}
