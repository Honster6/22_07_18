package creational.prototype;

public class PrototypeComputerBuilder {
    private final static Computer prototype = new Computer("AMD",
            64,
            "52 cale");
    Computer getComputer() {
        return (Computer) prototype.clone();

    }

}
