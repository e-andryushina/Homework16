package persons;

import transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName, int drivingExperience, Car car) {
        super(fullName, "B", drivingExperience, car);
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
