package creational.abstractMethod;

public class OsxInput implements Input{
    private String text;

    public OsxInput(String text) {
        this.text = text;
    }

    public OsxInput() {

    }

    @Override
    public void write(String value) {

    }

    @Override
    public String getText() {
        return null;
    }
}
