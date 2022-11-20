package transport;

import persons.Driver;
import persons.Mechanic;
import persons.Sponsor;

import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private final String carBrand;
    private final String carModel;
    private final double engineVolume;
    private final Driver driver;
    private final List <Mechanic> mechanics;
    private final List <Sponsor> sponsors;



    protected Transport(String carBrand, String carModel, double engineVolume,
                        Driver driver, List<Mechanic> mechanics, List<Sponsor> sponsors) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mechanics = mechanics;
        this.sponsors = sponsors;
    }

    public abstract void startMovement ();

    public abstract void endMovement();

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void getPersonInfo () {
        System.out.println("Водитель: " + driver.getFullName());
        for (Sponsor sponsor : sponsors) {
            System.out.println(sponsor);
        }
        for (Mechanic mechanic : mechanics) {
            System.out.println(mechanic);
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && carBrand.equals(transport.carBrand) && carModel.equals(transport.carModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, engineVolume);
    }
}
