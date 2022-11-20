package persons;

import transport.Truck;
public class DriverC extends Driver <Truck> {

    public DriverC(String fullName, int drivingExperience, Truck car) {
        super(fullName, "C", drivingExperience, car);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
