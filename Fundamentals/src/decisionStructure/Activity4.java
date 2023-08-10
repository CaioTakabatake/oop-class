package decisionStructure;

import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valorNotebook = 3299.00;
        double valorCelular = 1789.00;
        double valorCarro = 68000.00;
        double valorApartamento = 180000.00;

        double percentualEconomiaNotebook = 0.05;
        double percentualEconomiaCelular = 0.1;
        double percentualEconomiaCarro = 0.02;
        double percentualEconomiaApartamento = 0.01;

        System.out.println("Informe o seu salário mensal:");
        double salarioMensal = scanner.nextDouble();

        double valorEconomiaNotebook = salarioMensal * percentualEconomiaNotebook;
        double valorEconomiaCelular = salarioMensal * percentualEconomiaCelular;
        double valorEconomiaCarro = salarioMensal * percentualEconomiaCarro;
        double valorEconomiaApartamento = salarioMensal * percentualEconomiaApartamento;

        int mesesNotebook = calcularMesesEconomia(valorNotebook, valorEconomiaNotebook);
        int mesesCelular = calcularMesesEconomia(valorCelular, valorEconomiaCelular);
        int mesesCarro = calcularMesesEconomia(valorCarro, valorEconomiaCarro);
        int mesesApartamento = calcularMesesEconomia(valorApartamento, valorEconomiaApartamento);

        System.out.println("Com um salário de R$ " + salarioMensal);
        System.out.println("Para comprar o Notebook, serão necessários " + mesesNotebook + " meses.");
        System.out.println("Para comprar o Celular, serão necessários " + mesesCelular + " meses.");
        System.out.println("Para comprar o Carro, serão necessários " + mesesCarro + " meses.");
        System.out.println("Para comprar o Apartamento, serão necessários " + mesesApartamento + " meses.");
    }

    public static int calcularMesesEconomia(double valorObjetivo, double valorEconomiaPorMes) {
        double valorAcumulado = 0;
        int meses = 0;

        while (valorAcumulado < valorObjetivo) {
            valorAcumulado += valorEconomiaPorMes;
            meses++;
        }

        return meses;
    }
}
