package revision;

import java.util.Scanner;

public class Eletric {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de kWh consumida:");
        double consumoKWh = scanner.nextDouble();

        System.out.println("Digite o tipo de instalação (R para residência, I para indústria ou C para comércio):");
        String tipoInstalacao = scanner.next().toUpperCase();

        double precoKWh;
        if (tipoInstalacao.equals("R")) {
            if (consumoKWh >= 500) {
                precoKWh = 0.40;
            } else {
                precoKWh = 0.65;
            }
        } else if (tipoInstalacao.equals("I")) {
            if (consumoKWh >= 5000) {
                precoKWh = 0.55;
            } else {
                precoKWh = 0.60;
            }
        } else if (tipoInstalacao.equals("C")) {
            if (consumoKWh <= 1000) {
                precoKWh = 0.55;
            } else {
                precoKWh = 0.60;
            }
        } else {
            System.out.println("Tipo de instalação inválido. Use 'R' para residência, 'I' para indústria ou 'C' para comércio.");
            scanner.close();
            return;
        }

        double valorAPagar = consumoKWh * precoKWh;
        System.out.println("O valor a pagar é: R$ " + valorAPagar);

        scanner.close();
    }

}
