package decisionStructure;

import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tabela de valores
        double valorDiariaFiatArgo = 98.00;
        double valorDiariaFiatMobi = 79.00;
        double valorDiariaHyundaiHb20 = 102.00;

        double valorPorKmFiatArgo = 2.39;
        double valorPorKmFiatMobi = 1.99;
        double valorPorKmHyundaiHb20 = 2.99;

        // Entrada de dados
        System.out.println("Informe o veículo escolhido (1 para Fiat Argo, 2 para Fiat Mobi, 3 para Hyundai Hb20):");
        int escolhaVeiculo = scanner.nextInt();

        System.out.println("Informe a quantidade de dias que o veículo será alugado:");
        int quantidadeDias = scanner.nextInt();

        System.out.println("Informe a quantidade de km rodados:");
        double quantidadeKmRodados = scanner.nextDouble();

        // Cálculo do valor do aluguel
        double valorTotalDiarias = 0;
        double valorTotalKmRodados = 0;

        switch (escolhaVeiculo) {
            case 1:
                valorTotalDiarias = valorDiariaFiatArgo * quantidadeDias;
                valorTotalKmRodados = valorPorKmFiatArgo * quantidadeKmRodados;
                break;
            case 2:
                valorTotalDiarias = valorDiariaFiatMobi * quantidadeDias;
                valorTotalKmRodados = valorPorKmFiatMobi * quantidadeKmRodados;
                break;
            case 3:
                valorTotalDiarias = valorDiariaHyundaiHb20 * quantidadeDias;
                valorTotalKmRodados = valorPorKmHyundaiHb20 * quantidadeKmRodados;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        double valorTotalAluguel = valorTotalDiarias + valorTotalKmRodados;

        // Saída do resultado
        System.out.println("Valor total das diárias: R$ " + valorTotalDiarias);
        System.out.println("Valor total por km rodado: R$ " + valorTotalKmRodados);
        System.out.println("Valor total do aluguel: R$ " + valorTotalAluguel);
    }
}
