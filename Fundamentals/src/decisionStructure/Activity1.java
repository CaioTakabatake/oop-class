package decisionStructure;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário (Gerente, Supervisor, Técnico ou Auxiliar): ");
        String cargo = scanner.nextLine();

        double salarioBase = 0;
        double inss = 0;
        double convenio = 0;

        switch (cargo.toLowerCase()) {
            case "gerente":
                salarioBase = 5590.00;
                inss = 8.0;
                convenio = 289.00;
                break;
            case "supervisor":
                salarioBase = 4128.00;
                inss = 7.0;
                convenio = 239.00;
                break;
            case "técnico":
                salarioBase = 3789.00;
                inss = 4.0;
                convenio = 189.00;
                break;
            case "auxiliar":
                salarioBase = 2345.00;
                inss = 2.0;
                convenio = 156.00;
                break;
            default:
                System.out.println("Cargo inválido.");
                scanner.close();
                return;
        }

        double descontoINSS = salarioBase * (inss / 100);
        double salarioLiquido = salarioBase - descontoINSS - convenio;

        System.out.println("Salário líquido do funcionário: R$ " + salarioLiquido);

        scanner.close();
    }
}
