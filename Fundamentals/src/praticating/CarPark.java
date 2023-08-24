package praticating;

public class CarPark {
    public static void main(String[] args) {
        Car skyline = new Car("Skyline", "Nissan", CarColor.BLUE, 2023, 4);
        System.out.println(skyline);

        skyline.increaseGear();
        System.out.println(skyline);

        skyline.changeGearToReverse();
        System.out.println(skyline);
    }
}
