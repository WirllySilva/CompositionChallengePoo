package PooComposition;

public class Cart {
    public static void main(String[] args) {
        
        Customer customer = new Customer("Wirlly");
        Purchase purcharce01 = new Purchase();
        purcharce01.addItem("Blue Pen", 2, 10);
        purcharce01.addItem("LapTop", 2000, 1);
        purcharce01.addItem("Notebook", 10, 1);
        
        customer.addPurchase(purcharce01);

        System.out.println(customer.getTotalPrice());
    }
    
}
