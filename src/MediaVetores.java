import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarando os vetores em branco
        int[] vetor1 = new int[5];
        double soma = 0;

        /* vetor1[0] = 1;
        vetor1[1] = 5;
        vetor1[2] = 4;
        vetor1[3] = 1;
        vetor1[4] = 1;*/
        // Recebendo os valores que o usuário digitar e armazenar dentro do vetor
        // armazenar na posição "i", que começa de zero e vai até a última posicao do vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor para o primeiro vetor: ");
            int num = sc.nextInt();
            vetor1[i] = num;
            soma += vetor1[i];
        }

        System.out.println("Soma: "+ soma);
        double media = soma / 5;
        System.out.println("Media: "+ media);
    }
}