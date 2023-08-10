package decisionStructure;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive number.");
        } else if (number < 0) {
            System.out.println("Negative number.");
        } else {
            System.out.println("Number is zero.");
        }

        scanner.close();
    }
}
