package classes;

public class BikeShop {

    public static void main(String[] args) {
        Bicycle caloi = new Bicycle(2, true, 3, "caloi", true, "black");

        caloi.ride(10);
        caloi.ride(20);

        System.out.println(caloi);
    }
}
