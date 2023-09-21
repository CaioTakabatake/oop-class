package inheritance;

public class Car extends Vehicle {
    private int numberOfDoors;
    private String transmissionModel;
    private String fuelType;

    public Car(String description, int year, String color, String model, String brand, double price, boolean isNew, boolean hasAbsBrake, int numberOfDoors, TransmissionEnum transmissionModel, FuelEnum fuelType) {
        super(description, year, color, model, brand, price, isNew, hasAbsBrake);
        this.numberOfDoors = numberOfDoors;
        this.transmissionModel = transmissionModel.getTypeTransmission();
        this.fuelType = fuelType.getFuelType();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", transmissionModel='" + transmissionModel + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
