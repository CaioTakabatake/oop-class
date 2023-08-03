package revision;

import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {
        double price200 = 0.50;
        double priceHigher200 = 0.45;
        int limit = 200;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância que deseja percorrer em km:");
        double distancia = scanner.nextDouble();

        double precoPassagem;
        if (distancia <= limit) {
            precoPassagem = distancia * price200;
        } else {
            precoPassagem = distancia * priceHigher200;
        }

        System.out.println("O preço da passagem é: R$ " + precoPassagem);

        scanner.close();
    }

}
