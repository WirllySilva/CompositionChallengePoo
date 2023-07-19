package PooComposition;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    final String customerName;
    final List<Purchase> purchases = new ArrayList<>();

Customer(String customerName) {
    this.customerName = customerName;
}

void addPurchase(Purchase purchase) {
    this.purchases.add(purchase);
}

double getTotalPrice() {
    double total = 0;

    for(Purchase purchase: purchases) {
        total += purchase.getTotalPrice();
    }
    return total;
}

}