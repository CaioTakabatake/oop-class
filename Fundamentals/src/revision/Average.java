package revision;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de valores a serem inseridos:");
        int quantidadeValores = scanner.nextInt();

        double soma = 0;
        for (int i = 1; i <= quantidadeValores; i++) {
            System.out.println("Digite o valor " + i + ":");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / quantidadeValores;
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }

}
