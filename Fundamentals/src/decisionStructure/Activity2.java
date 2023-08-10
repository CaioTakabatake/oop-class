package decisionStructure;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a largura do terreno em metros: ");
        double largura = scanner.nextDouble();

        System.out.print("Informe o comprimento do terreno em metros: ");
        double comprimento = scanner.nextDouble();

        double areaTotal = largura * comprimento;
        double valorMetroQuadrado;

        if (areaTotal <= 250) {
            valorMetroQuadrado = 8.5;
        } else if (areaTotal <= 350) {
            valorMetroQuadrado = 9.5;
        } else {
            valorMetroQuadrado = 11.5;
        }

        double valorFinal = areaTotal * valorMetroQuadrado;

        System.out.println("Área total: " + areaTotal + " m²");
        System.out.println("Valor por m²: R$ " + valorMetroQuadrado);
        System.out.println("Valor a ser pago: R$ " + valorFinal);

        scanner.close();
    }
}
