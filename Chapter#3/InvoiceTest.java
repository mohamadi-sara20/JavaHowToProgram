package ir.phgnight;
//Just a quick look at how Invoice class can manage bills.

public class InvoiceTest {
    public static void main(String[] args){
        Invoice easyShop = new Invoice("900", "January Bill", 100, 9.56);
        System.out.printf("Number: %s Description: %s Items to be purchased: %d Cost per item: %.2f%n",easyShop.getNumber(), easyShop.getDescription(), easyShop.getItemsPurchased(), easyShop.getCost());
        easyShop.setNumber("1100");
        easyShop.setCost(9.20);
        easyShop.setItemsPurchased(200);
        System.out.printf("Number: %s Description: %s Items to be purchased: %d Cost per item: %.2f%n",easyShop.getNumber(), easyShop.getDescription(), easyShop.getItemsPurchased(), easyShop.getCost());
        System.out.printf("It would overall cost us %.2f$.%n", easyShop.getInvoiceAmount(easyShop.getCost(), easyShop.getItemsPurchased()));





    }
}





