package classes;

public class Bicycle {
    private int wheels;
    private boolean gears;
    private int quantityGears;
    private String model;
    private boolean hasBrake;
    private String color;
    private String situation;
    private int speed;

    public Bicycle() {

    }

    public Bicycle(int wheels, boolean gears, int quantityGears, String model, boolean hasBrake, String color) {
        this.wheels = wheels;
        this.gears = gears;
        this.quantityGears = quantityGears;
        this.model = model;
        this.hasBrake = hasBrake;
        this.color = color;
        this.situation = "stopped";
        this.speed = 0;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isGears() {
        return gears;
    }

    public void setGears(boolean gears) {
        this.gears = gears;
    }

    public int getQuantityGears() {
        return quantityGears;
    }

    public void setQuantityGears(int quantityGears) {
        this.quantityGears = quantityGears;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isHasBrake() {
        return hasBrake;
    }

    public void setHasBrake(boolean hasBrake) {
        this.hasBrake = hasBrake;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private void accelerate(int speed) {
        this.setSpeed(this.getSpeed() + speed);
    }

    private void decelerate() {
        this.setSpeed(this.getSpeed() - 1);
    }

    public void ride(int speed) {
        this.setSituation("riding");
        System.out.println("Bicycle is now riding.");
        this.accelerate(speed);
    }

    public void brake() {
        this.setSituation("braking");
        System.out.println("Bicycle is now braking.");
        this.decelerate();
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "wheels=" + wheels +
                ", gears=" + gears +
                ", quantityGears=" + quantityGears +
                ", model='" + model + '\'' +
                ", hasBrake=" + hasBrake +
                ", color='" + color + '\'' +
                ", situation='" + situation + '\'' +
                ", speed=" + speed +
                '}';
    }
}

