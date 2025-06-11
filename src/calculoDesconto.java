import java.util.Scanner;

public class calculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto: ");
        double porcentagemDesconto = scanner.nextDouble();

        double desconto = (porcentagemDesconto / 100) * valorProduto;
        double valorFinal = valorProduto - desconto;

        System.out.printf("O valor final do produto após o desconto é: %.2f%n", valorFinal);
    }
}
