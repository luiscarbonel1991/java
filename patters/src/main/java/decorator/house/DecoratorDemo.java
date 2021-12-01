package decorator.house;

import static java.lang.System.*;

public class DecoratorDemo {

    public static void main(String[] args) {
        HouseComponent houseComponent = new House("Locations test", 30.0);
        out.println("houseComponent.calculateSquareMeters() = " + houseComponent.calculateSquareMeters());
        HouseWithPool houseWithPool = new HouseWithPool(houseComponent);
        houseWithPool.setSquareMeters(20);
        out.println("houseWithPool.calculateSquareMeters() = " + houseWithPool.calculateSquareMeters());
        HouseWithGarage houseWithGarage = new HouseWithGarage(houseWithPool);
        houseWithGarage.setSquareMeter(25);
        out.println("houseWithGarage.calculateSquareMeters() = " + houseWithGarage.calculateSquareMeters());
    }
}
