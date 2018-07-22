package creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        VehicleBuilder builder = new AmericanVehicleBuilder();
        Vehicle build = builder.build();
        
    }
}
