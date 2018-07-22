package structural.decorator;

public class FineDecorator implements Viewable{
        public final Viewable view;

    public FineDecorator(Viewable view) {
        this.view = view;
    }

    @Override
    public void show() {
        showBefore();
        view.show();
        showAfter();
    }
    protected void showBefore() {

    }
    protected void showAfter() {

    }
}
