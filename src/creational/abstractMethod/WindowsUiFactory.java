package creational.abstractMethod;

public class WindowsUiFactory implements UiAbstractFactory{

    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Input getInput() {
        return new WindowsInput();
    }
}
