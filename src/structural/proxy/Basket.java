package structural.proxy;

import java.util.List;

interface Basket {
     void addProduct(Product product);
     void removeProduct(Product product);
             List<Product> getProduct();
 }
