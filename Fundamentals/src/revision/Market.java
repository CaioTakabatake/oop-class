package revision;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o valor do produto:");
        double valorProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade do produto:");
        int quantidadeProduto = scanner.nextInt();

        double valorTotal = valorProduto * quantidadeProduto;

        System.out.println("Digite a forma de pagamento (D para débito, C para crédito):");
        String formaPagamento = scanner.next();

        if (formaPagamento.equalsIgnoreCase("D")) {
            double desconto;
            if (valorTotal <= 100) {
                desconto = 0.05; // 5% de desconto
            } else {
                desconto = 0.03; // 3% de desconto
            }
            valorTotal -= valorTotal * desconto;
            System.out.println("Pagamento em débito com desconto aplicado.");
        } else if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Pagamento em crédito.");
        } else {
            System.out.println("Forma de pagamento inválida. Apenas 'D' para débito ou 'C' para crédito são aceitas.");
            return;
        }

        if (formaPagamento.equalsIgnoreCase("C")) {
            System.out.println("Digite o número de parcelas:");
            int numParcelas = scanner.nextInt();

            if (numParcelas <= 0) {
                System.out.println("Número de parcelas inválido. Deve ser maior que zero.");
                return;
            }

            double valorParcela = valorTotal / numParcelas;
            System.out.println("Pagamento parcelado em " + numParcelas + " vezes de R$ " + valorParcela);
        } else {
            System.out.println("Valor total da compra: R$ " + valorTotal);
        }

        System.out.println("Informações da compra:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + valorProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
