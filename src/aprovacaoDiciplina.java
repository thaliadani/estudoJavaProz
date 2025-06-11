import java.util.Scanner;

public class aprovacaoDiciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da disciplina: ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0) {
            System.out.println("Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
