package creational.abstractMethod;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Nie ruszać!");
    }
    @Override
    public void show() {
        System.out.println("Jestem przyciskiem z Windy");
    }
}
