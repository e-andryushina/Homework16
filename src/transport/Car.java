package transport;

import persons.DriverB;
import persons.Mechanic;
import persons.Sponsor;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    public Car(String carBrand, String carModel, double engineVolume,
               DriverB driverB, List<Mechanic> mechanics, List<Sponsor> sponsors) {
        super(carBrand, carModel, engineVolume, driverB, mechanics, sponsors);
    }

    @Override
    public void startMovement() {
        System.out.printf("Автомобиль %s %s начал движение",
                this.getCarBrand(),
                this.getCarModel());
    }

    @Override
    public void endMovement() {
        System.out.printf("Автомобиль %s %s начал движение",
                this.getCarBrand(),
                this.getCarModel());
    }


    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s совершил пит-стоп",
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
