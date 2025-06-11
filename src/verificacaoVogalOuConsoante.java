import java.util.Scanner;

public class verificacaoVogalOuConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        if (Character.isLetter(letra)) {
            switch (letra) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("A letra '" + letra + "' é uma vogal.");
                    break;
                default:
                    System.out.println("A letra '" + letra + "' é uma consoante.");
                    break;
            }
        } else {
            System.out.println("O caractere digitado não é uma letra válida.");
        }
    }
}
