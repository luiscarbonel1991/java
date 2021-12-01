package decorator.house;

public class House implements HouseComponent{

    private String location;
    private final Double meters;

    public House(String location, Double meters) {
        this.location = location;
        this.meters = meters;
    }

    public Double getMeters() {
        return meters;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public double calculateSquareMeters() {
        return getMeters() * 2;
    }

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", meters=" + meters +
                '}';
    }
}
