import java.util.Scanner;

public class conversaoIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        int meses = 12;
        int dias = 365;

        int idadeEmMeses = anos * meses;
        int idadeEmDias = anos * dias;

        System.out.printf("Sua idade em meses é: %d%n", idadeEmMeses);
        System.out.printf("Sua idade em dias é: %d%n", idadeEmDias);
    }
}
