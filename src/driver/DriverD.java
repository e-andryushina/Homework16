package driver;

import transport.Bus;

public class DriverD extends Driver <Bus>{
    public DriverD(String fullName, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
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
