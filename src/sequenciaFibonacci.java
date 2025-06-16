import java.util.Scanner;

public class sequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números da sequencia:");
        
        int numero = scanner.nextInt();
        int ultima = 1;
        int penultima = 1;
        int contador= 0;

        while (contador < numero) {
            int atual = ultima + penultima;
            System.out.println(atual);
            penultima = ultima;
            ultima = atual;
            contador++;
        }
    }
}
