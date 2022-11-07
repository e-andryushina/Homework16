package transport;

import java.util.Objects;

public abstract class Transport {
    private final String carBrand;
    private final String carModel;
    private final double engineVolume;

    protected Transport(String carBrand, String carModel, double engineVolume) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.engineVolume = engineVolume;
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
