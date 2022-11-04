package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {

    public Car(String carBrand, String carModel, double engineVolume) {
        super(carBrand, carModel, engineVolume);
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
}
