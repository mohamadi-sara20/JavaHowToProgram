package ir.phgnight;

/**
 * Unit test for simple App.
 */
import java.util.Scanner;

public class Accountt {
    private String name;
    private double balance;
    public Accountt(String name, double balance) {
        this.name = name;
        if (balance > 0){
            this.balance = balance;}
    }
    public void deposit(double amount){
        if (amount >0){
            balance = balance + amount;}}

    public void withdraw(double amount){
        if(amount <= balance){
            balance = balance - amount;
            System.out.printf("Your current balance is %.2f. %n", balance);
        }
        else{System.out.printf("Withdrawal amount exceeded account balance! Your current balance is %.2f. %n", balance);}
    }

    public double getBalance(){
            return balance;}

    public String getName(){
            return this.name;}

    public void setName(String name){
            this.name = name;}
    public String diplayAccount(Accountt ac){

        return ac.name + " " + ac.balance;
    }

    }
