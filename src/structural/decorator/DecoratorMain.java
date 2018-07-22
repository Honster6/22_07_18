package structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Viewable view = new Fine("Piłes przed zajeciami!");
        view = new Admonishment(view);
        view.show();
    }
}
