package ir.phgnight;

/**
 * Unit test for simple App.
 */

import java.util.Scanner;

public class Invoice {
    private String number;
    private String description;
    private int itemsPurchased;
    private double cost;

    public Invoice(String number, String description, int itemsPurchased, double cost){
        this.number = number;
        this.description = description;
        this.itemsPurchased = itemsPurchased;
        this.cost = cost;
    }
    public void setItemsPurchased(int itemsPurchased){
        this.itemsPurchased = itemsPurchased;
    }

    public int getItemsPurchased() {
        return itemsPurchased;}

    public void setNumber(String number){
        this.number = number;}

    public String getNumber(){
        return number;}

    public void setDescription(String description){
        this.description = description;}

    public String getDescription(){
        return description;}

    public void setCost(double cost){
        this.cost = cost;}

    public double getCost(){
        return cost;}

    public double getInvoiceAmount(double cost, int itemsPurchased){
        if (cost < 0){
            return 0;}
        else{
            return cost * itemsPurchased;}}
}





