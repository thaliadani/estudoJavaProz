import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 5;
        int contador = 1;
        int resultado = 0;

        while ( contador <= quantidade) {
            System.out.println("Digite um numero:");
            int numero = scanner.nextInt();
            resultado += numero;
            contador++;
        }
         System.out.println(resultado);
    }
}