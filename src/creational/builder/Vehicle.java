package creational.builder;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Vehicle {
    private final int tankSize;
    private final List<Wheel> wheels;

        public Vehicle(int tankSize, List<Wheel> wheels) {
            this.tankSize = tankSize;
            this.wheels = Collections.unmodifiableList(wheels);
        }

    public int getTankSize() {
        return tankSize;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}
