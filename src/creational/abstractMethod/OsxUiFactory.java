package creational.abstractMethod;

public class OsxUiFactory implements UiAbstractFactory{

    @Override
    public Button getButton() {
        return new OsxButton();
    }

    @Override
    public Input getInput() {
        return new OsxInput();
    }
}
