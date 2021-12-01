package decorator.house;

public class HouseWithPool extends HouseDecorator{

    private double squareMeters = 0.0;

    public HouseWithPool(HouseComponent houseComponent) {
        super(houseComponent);
    }

    @Override
    public double calculateSquareMeters() {
        return houseComponent.calculateSquareMeters() + this.squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }
}
