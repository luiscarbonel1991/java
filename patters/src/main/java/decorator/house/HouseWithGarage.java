package decorator.house;

public class HouseWithGarage extends HouseDecorator{

    private double squareMeter = 0.0;

    public HouseWithGarage(HouseComponent houseComponent) {
        super(houseComponent);
    }

    @Override
    public double calculateSquareMeters() {
        return houseComponent.calculateSquareMeters() + this.squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }
}
