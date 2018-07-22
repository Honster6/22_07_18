package creational.abstractMethod;

public class OsxButton implements Button {
    @Override
    public void click() {
        System.out.println("Jesteś wspaniały");
    }
    @Override
    public void show() {
        System.out.println("Jestem ładny");
    }


}
