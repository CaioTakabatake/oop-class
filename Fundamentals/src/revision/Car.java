package revision;

import java.util.Scanner;

public class Car {

    public static void main(String[] args) {
        double limiteVelocidade = 80;
        double valorMultaPorKM = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade do carro em km/h:");
        int velocidadeCarro = scanner.nextInt();

        if (velocidadeCarro > limiteVelocidade) {
            double kmAcimaLimite = velocidadeCarro - limiteVelocidade;
            double valorMulta = kmAcimaLimite * valorMultaPorKM;
            System.out.println("Motorista foi multado!");
            System.out.println("Valor da multa: R$ " + valorMulta);
        } else {
            System.out.println("Velocidade dentro do limite permitido. Boa viagem!");
        }

        scanner.close();
    }
}
