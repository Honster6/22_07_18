package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class AmericanVehicleBuilder implements VehicleBuilder {
    private List<Wheel> wheels = new ArrayList<>();
    private int tankSize;
    public void addWheel() {
        wheels.add(new Wheel(27));
        }
    public void setTank(int size) {
        }
        public Vehicle build() {
        return null;
    }
}
