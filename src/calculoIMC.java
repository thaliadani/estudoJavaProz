import java.util.Scanner;

public class calculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
    }
}
