package behaviora.command;

public class TurnOnLight implements Command{
    private final Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Wlaczam swiatlo");
        light.turnOn();
    }
}
