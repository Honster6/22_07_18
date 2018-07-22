package structural.decorator;

public class Admonishment extends FineDecorator{
    public Admonishment(Viewable view) {
        super(view);
    }

    @Override
    protected void showAfter() {
        super.showAfter();
        {
            System.out.println("¯\\(◉‿◉)/¯");
        }
    }
}
