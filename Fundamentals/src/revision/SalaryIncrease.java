package revision;

import java.util.Scanner;

public class SalaryIncrease {

    public static void main(String[] args) {
        final double salaryLimit = 1350.00;
        final double percentageIncreaseUP = 0.10; // 10%
        final double percentageIncreaseDown = 0.15; // 15%

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        double percentualAumento;
        if (salario > salaryLimit) {
            percentualAumento = percentageIncreaseUP;
        } else {
            percentualAumento = percentageIncreaseDown;
        }

        double valorAumento = salario * percentualAumento;
        double novoSalario = salario + valorAumento;

        System.out.println("O valor do aumento é: R$ " + valorAumento);
        System.out.println("O novo salário é: R$ " + novoSalario);

        scanner.close();
    }

}
