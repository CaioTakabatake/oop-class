package inheritance;

public class Motorcycle extends Vehicle {
    private String fuelType;
    private String startType;

    public Motorcycle(String description, int year, String color, String model, String brand, double price, boolean isNew, boolean hasAbsBrake, String fuelType, StartEnum startType) {
        super(description, year, color, model, brand, price, isNew, hasAbsBrake);
        this.fuelType = fuelType;
        this.startType = startType.getType();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Motorcycle{" +
                "fuelType='" + fuelType + '\'' +
                ", startType='" + startType + '\'' +
                '}';
    }
}
