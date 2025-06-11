import java.util.Scanner;

public class calculoDescontoComCondicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double desconto = 10.0; // 10% de desconto

        if (valorProduto > 100){
            double valorDesconto = (valorProduto * desconto) / 100;
            double valorFinal = valorProduto - valorDesconto;
            System.out.printf("Valor do produto com desconto: R$ %.2f%n", valorFinal);
        } else {
            desconto = 0.0; // Sem desconto
            System.out.printf("Valor sem desconto: R$ %.2f%n", valorProduto);
        }

    }
}
