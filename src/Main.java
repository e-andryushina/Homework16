import persons.Driver;
import persons.DriverB;
import persons.Sponsor;
import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car ("Audi", "Q6", 2.5, null, null, null);
        Driver driverB = new DriverB("Сергеев Сергей Сергеевич", 3, car);
        System.out.println(driverB);
    }
}