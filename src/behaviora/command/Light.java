package behaviora.command;

public class Light {
    private boolean flash = false;
    public void turnOn() {
        flash = true;
    }
    public void turnOff() {
        flash = false;
    }
}

