package behaviora.command;

public class CommandLight {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteController remoteController = new RemoteController(light);
        remoteController.clickButton1();
        remoteController.clickButton2();
    }
}
