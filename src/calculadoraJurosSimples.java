import java.util.Scanner;

public class calculadoraJurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();

        System.out.print("Digite a taxa de juros em porcentagem: ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o tempo em anos: ");
        double tempo = scanner.nextDouble();

        // Cálculo dos juros simples
        double jurosSimples = valor * (taxaJuros / 100) * tempo;

        // Cálculo do montante final
        double montanteFinal = valor + jurosSimples;

        System.out.printf("O montante final após %.2f anos é: %.2f%n", tempo, montanteFinal);
    }
}
