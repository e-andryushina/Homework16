package transport;

import persons.Driver;
import persons.DriverD;
import persons.Mechanic;
import persons.Sponsor;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    public Bus(String carBrand, String carModel, double engineVolume,
               DriverD driverD, List<Mechanic> mechanics, List<Sponsor> sponsors) {
        super(carBrand, carModel, engineVolume, driverD, mechanics, sponsors);
    }

    @Override
    public void startMovement() {
        System.out.printf("Автобус %s %s начал движение",
                this.getCarBrand(),
                this.getCarModel());
    }

    @Override
    public void endMovement() {
        System.out.printf("Автобус %s %s закончил движение",
                this.getCarBrand(),
                this.getCarModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус %s %s совершил пит-стоп",
                this.getCarBrand(),
                this.getCarModel());

    }

    @Override
    public int getBestLapTime() {

        return  ThreadLocalRandom.current().nextInt();
    }

    @Override
    public int getMaxSpeed() {
        return  ThreadLocalRandom.current().nextInt();
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
