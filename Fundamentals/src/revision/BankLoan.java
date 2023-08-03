package revision;

import java.util.Scanner;

public class BankLoan {

    public static void main(String[] args) {
        final double limitPercentage = 0.30; // 30%

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da casa a comprar:");
        double valorCasa = scanner.nextDouble();

        System.out.println("Digite o salário da pessoa:");
        double salario = scanner.nextDouble();

        System.out.println("Digite a quantidade de anos a pagar:");
        int anosPagar = scanner.nextInt();

        int totalMeses = anosPagar * 12;
        double valorPrestacao = valorCasa / totalMeses;

        double limitePrestacao = salario * limitPercentage;

        if (valorPrestacao <= limitePrestacao) {
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor da prestação mensal: R$ " + valorPrestacao);
        } else {
            System.out.println("Empréstimo não aprovado. A prestação mensal excede 30% do salário.");
        }

        scanner.close();
    }

}
