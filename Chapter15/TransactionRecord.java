//Question#2 & Question#4#5
package JavaHowToProgram.Chapter15;

public class TransactionRecord {
    private int accountNumber;
    private double amount;
    public TransactionRecord(){
        this(0, 0);
    }
    public TransactionRecord(int accountNumber, double amount){
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public void setAmount(double amount){this.amount = amount;}
    public void setAccountNumber(int number){this.accountNumber = number;}
    public int getAccountNumber(){return this.accountNumber;}
    public double getAmount(){return this.amount;}

}
