package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {

    public Truck(String carBrand, String carModel, double engineVolume) {
        super(carBrand, carModel, engineVolume);
    }

    @Override
    public void startMovement() {
        System.out.printf("Грузовик %s %s начал движение",
                this.getCarBrand(),
                this.getCarModel());
    }

    @Override
    public void endMovement() {
        System.out.printf("Грузовик %s %s закончил движение",
                this.getCarBrand(),
                this.getCarModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Грузовик %s %s совершил пит-стоп",
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
}
