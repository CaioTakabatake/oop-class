package praticating;

public class Car {
    private String model;
    private String brand;
    private CarColor color;
    private CarGear gear;
    private int year;
    private int wheels;

    public Car(String model, String brand, CarColor color, int year, int wheels) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.gear = CarGear.NEUTRAL;
        this.year = year;
        this.wheels = wheels;
    }

    public void increaseGear() {
        CarGear currentGear = this.gear;

        if (currentGear == CarGear.REVERSE_GEAR) {
            // If the current gear is in reverse, set to neutral
            this.gear = CarGear.NEUTRAL;
        } else if (currentGear != CarGear.FIFTH_GEAR) {
            // Increment the gear if not in the highest gear
            this.gear = CarGear.values()[currentGear.getNumberGear()];
        }
    }

    public void changeGearToReverse() {
        this.gear = CarGear.REVERSE_GEAR;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public CarGear getGear() {
        return gear;
    }

    public void setGear(CarGear gear) {
        this.gear = gear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color=" + color +
                ", gear=" + gear +
                ", year=" + year +
                ", wheels=" + wheels +
                '}';
    }
}
