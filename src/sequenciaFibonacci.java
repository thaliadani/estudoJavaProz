import java.util.Scanner;

public class sequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        
        int numero = scanner.nextInt();
        int primeiro = 1;
        int segundo = 1;
        int contador= 2;

        System.out.println("Sequência de Fibonacci com " +  numero + " números:");
        System.out.print(primeiro + ", " + segundo);

        while (contador < numero) {
            int proximo = primeiro + segundo;
            System.out.print(", " + proximo);

            primeiro = segundo;
            segundo = proximo;
            contador++;

        }
    }

}
