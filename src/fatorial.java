import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int contador = numero-1;

        while ( contador != 0) {
            numero*= contador;
            contador--;
        }

        System.out.println(numero);
    }
}
