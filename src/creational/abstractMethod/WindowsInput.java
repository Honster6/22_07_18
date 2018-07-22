package creational.abstractMethod;

public class WindowsInput implements Input{
    private StringBuilder stringBuilder = new StringBuilder();
    @Override
    public void write(String value) {

    }

    @Override
    public String getText() {
        return null;
    }
}
