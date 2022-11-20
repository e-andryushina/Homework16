package persons;

import transport.Transport;

import java.util.Objects;

public abstract class Driver <T extends Transport> {
    private final String fullName;
    private final String lisenceCategory;
    private final int drivingExperience;
    private final T car;

    protected Driver(String fullName, String lisenceCategory, int drivingExperience, T car) {
        this.fullName = fullName;
        this.lisenceCategory = lisenceCategory;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLisenceCategory() {
        return lisenceCategory;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void startMovement () {
        System.out.printf("Водитель %s завел начал движение", this.fullName);
        car.startMovement();
    }

    public void endMovement () {
        System.out.printf("Водитель %s остановил транспортное средство", this.fullName);
        car.endMovement();
    }
    public void refill () {
        System.out.printf("Водитель %ы заправил %s %s",
                this.fullName,
                this.car.getCarBrand(),
                this.car.getCarModel());
    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет авомобилем %s %s " +
                "и будет участвовать в заезде",
                this.fullName,
                this.car.getCarBrand(),
                this.car.getCarModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingExperience == driver.drivingExperience && fullName.equals(driver.fullName) && lisenceCategory.equals(driver.lisenceCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, lisenceCategory, drivingExperience);
    }
}
