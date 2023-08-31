package oop;

import java.io.PrintStream;

public class Rental {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true));

        Client firstClient = new Client("Caio Takabatake");
        System.out.println(firstClient);
        double valueRentalSimple = firstClient.calculateRental(3);
        System.out.println("The value for renting the movie is: " + valueRentalSimple);

        Client secondClient = new Client("Caio Zein", "caiozein@gmail.com");
        System.out.println(secondClient);
        double valueRentalLRelease = secondClient.calculateRental(3, true);
        System.out.println("The value for renting the movie is: " + valueRentalLRelease);
    }
}
