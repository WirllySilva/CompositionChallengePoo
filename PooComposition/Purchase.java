package PooComposition;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    
   final  List<Item> items = new ArrayList<>();

    void addItem(String productName, double price, int quantity) {
        var product = new Product(productName, price);
        this.items.add(new Item(product, quantity));
    }

double getTotalPrice() {
    double total = 0;

    for(Item item: items) {
        total += item.quantity * item.product.price;
    }
    return total;
}
}
