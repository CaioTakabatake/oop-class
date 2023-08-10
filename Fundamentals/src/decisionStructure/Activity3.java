package decisionStructure;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção de prato:");
        System.out.println("1 - Arroz, feijão, bife acebolado (R$ 19,99)");
        System.out.println("2 - Arroz, feijão, filé de frango (R$ 18,99)");
        System.out.println("3 - Arroz, feijão, brajola (R$ 23,99)");
        System.out.print("Digite o número da opção desejada: ");

        int opcao = scanner.nextInt();

        double valorPrato;

        switch (opcao) {
            case 1:
                valorPrato = 19.99;
                break;
            case 2:
                valorPrato = 18.99;
                break;
            case 3:
                valorPrato = 23.99;
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida.");
                scanner.close();
                return;
        }

        System.out.print("Digite a quantidade de pratos desejada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = valorPrato * quantidade;

        System.out.println("Opção escolhida: " + opcao);
        System.out.println("Valor unitário do prato: R$ " + valorPrato);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}
