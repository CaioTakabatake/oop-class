package praticating;

public class Car {
    private String model;
    private String brand;
    private String color;
    private int year;
    private int wheels;

    public Car(String model, String brand, String color, int year, int wheels) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.wheels = wheels;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
}
