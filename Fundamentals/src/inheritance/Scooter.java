package inheritance;

public class Scooter extends Vehicle{
    private String potencyBattery;

    public Scooter(String description, int year, String color, String model, String brand, double price, boolean isNew, boolean hasAbsBrake, String potencyBattery) {
        super(description, year, color, model, brand, price, isNew, hasAbsBrake);
        this.potencyBattery = potencyBattery;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Scooter{" +
                "potencyBattery='" + potencyBattery + '\'' +
                '}';
    }
}
