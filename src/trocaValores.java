import java.util.Scanner;

public class trocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.printf("Antes da troca: Valor 1 = %d, Valor 2 = %d%n", valor1, valor2);

        int temp = valor1;
        valor1 = valor2;
        valor2 = temp;

        System.out.printf("Após a troca: Valor 1 = %d, Valor 2 = %d%n", valor1, valor2);
    }
}
