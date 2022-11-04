package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {

    public Bus(String carBrand, String carModel, double engineVolume) {
        super(carBrand, carModel, engineVolume);
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
}
