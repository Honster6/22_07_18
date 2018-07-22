package structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        RealBasket realBasket = new RealBasket();
        Client client = new Client(new BasketLogerProxy(realBasket));
        client.doActions();
        realBasket.getProduct().forEach(System.out::println);
        realBasket.getProduct().forEach(product -> System.out.println(product));
    }
}
