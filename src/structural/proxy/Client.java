package structural.proxy;

public class Client {
    private final Basket basket;

    public Client(Basket basket) {
        this.basket = basket;
    }

    public void doActions() {
        basket.addProduct(new Product("szampon"));
        basket.addProduct(new Product("2 piwa"));
        basket.addProduct(new Product("karton wódki"));
        basket.addProduct(new Product("soczek na zapojke"));
        basket.removeProduct(new Product("2 piwa"));

    }
}
