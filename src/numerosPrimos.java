import java.util.Scanner;

public class numerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scanner.nextInt();
        int div = 0;
        int contador = 1;

        while ( contador <= numero) {
            if(numero % contador == 0){
                div++;
            }
            contador++;
        }

       if(div == 2){
           System.out.println("É primo");
       }else{
          System.out.println("Não é primo");
       }
    }
}