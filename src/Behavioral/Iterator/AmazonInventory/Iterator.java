package Behavioral.Iterator.AmazonInventory;

// iterator interface
public interface Iterator {

    Product first();
    Product next();
    boolean hasNext();
}
