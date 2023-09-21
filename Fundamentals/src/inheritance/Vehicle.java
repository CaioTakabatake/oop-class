package inheritance;

public class Vehicle {
    private String description;
    private int year;
    private String color;
    private String model;
    private String brand;
    private double price;
    private boolean isNew;
    private boolean hasAbsBrake;

    public Vehicle(String description, int year, String color, String model, String brand, double price, boolean isNew, boolean hasAbsBrake) {
        this.description = description;
        this.year = year;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.price = price;
        this.isNew = isNew;
        this.hasAbsBrake = hasAbsBrake;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isHasAbsBrake() {
        return hasAbsBrake;
    }

    public void setHasAbsBrake(boolean hasAbsBrake) {
        this.hasAbsBrake = hasAbsBrake;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "description='" + description + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                ", hasAbsBrake=" + hasAbsBrake +
                '}';
    }
}
