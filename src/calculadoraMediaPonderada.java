import java.util.Scanner;

public class calculadoraMediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite o peso da primeira prova: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite o peso da segunda prova: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite o peso da terceira prova: ");
        double peso3 = scanner.nextDouble();

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.printf("A média ponderada das provas é: %.2f%n", mediaPonderada);
    }
}
