package decorator.house;

public abstract class HouseDecorator implements HouseComponent{

    protected HouseComponent houseComponent;

    protected HouseDecorator(HouseComponent houseComponent) {
        this.houseComponent = houseComponent;
    }
}
