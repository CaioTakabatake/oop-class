package inheritance;

public class Parking {
    public static void main(String[] args) {
        Car lamborghini = new Car("Lamborghini Aventador SVJ", 2023, "Yellow", "Aventador", "Lamborghini", 500000.0, true, true, 2, TransmissionEnum.AUTOMATIC, FuelEnum.GASOLINE);
        Motorcycle bmwS1000 = new Motorcycle("BMW S1000RR", 2023, "Blue", "S1000RR", "BMW", 18000.0, true, true, "Gasoline", StartEnum.ELECTRIC_START);
        Scooter myScooter = new Scooter("Electric Scooter", 2023, "Black", "Model X", "ScooterCo", 1500.0, true, true, "48V Lithium-ion");

        System.out.println(lamborghini);
        System.out.println(bmwS1000);
        System.out.println(myScooter);
    }
}
