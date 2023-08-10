

package decisionStructure;

import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("Sucess");
        } else {
            System.out.println("Error");
        }
        
        scanner.close();
    }
}
