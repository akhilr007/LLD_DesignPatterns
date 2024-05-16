package Behavioral.Iterator.AmazonInventory;

public class AmazonInventoryApplication {

    public static void main(String[] args) {

        // create products
        Product product1 = new Product("Laptop", 99999.99);
        Product product2 = new Product("Smartphone", 49999.99);
        Product product3 = new Product("AC", 12999.99);

        // create an inventory and add products
        Inventory inventory = new Inventory();
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        // create an iterator and iterate over the products
        Iterator iterator = inventory.createIterator();

        while(iterator.hasNext()){

            Product currentProduct = iterator.next();
            System.out.println(currentProduct);
        }
    }
}
