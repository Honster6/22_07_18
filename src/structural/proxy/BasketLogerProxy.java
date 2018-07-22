package structural.proxy;

import java.util.List;

public class BasketLogerProxy implements Basket {
    private final RealBasket realBasket;

    public BasketLogerProxy(RealBasket realBasket) {
        this.realBasket = realBasket;
    }

    @Override
    public void addProduct(Product product) {
        realBasket.addProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("Uzytkownik usunal produkt: " + product);
        realBasket.removeProduct(product);
    }

    @Override
    public List<Product> getProduct() {
        return null;
    }
}
