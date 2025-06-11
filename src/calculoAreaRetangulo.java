import java.util.Scanner;

public class calculoAreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        System.out.printf("A área do retângulo é: %.2f%n", area);

    }
}
