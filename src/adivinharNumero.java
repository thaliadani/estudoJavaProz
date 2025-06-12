import java.util.Scanner;

public class adivinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 5;
        int chute = 0;


        while (numero!= chute){

            System.out.println("Digite um numero");
            chute = scanner.nextInt();

            if (chute > numero){
                System.out.println("Chute foi maior");
            } else if (chute < numero) {
                System.out.println("Chute foi menor");
            }

        }

        System.out.println("Acertou");
    }


}
