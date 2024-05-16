package Behavioral.Iterator.AmazonInventory;

import java.util.ArrayList;
import java.util.List;

// aggregates class that stores products and provides an interface
public class Inventory {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public Iterator createIterator(){
        return new ProductIterator(products);
    }
}
