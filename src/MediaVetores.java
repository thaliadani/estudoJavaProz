import java.util.Scanner;

public class MediaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declarando os vetores em branco
        int[] vetor1 = new int[5];
        double soma = 0;

        // Recebendo os valores que o usuário digitar e armazenar dentro do vetor
        // armazenar na posição "i", que começa de zero e vai até a última posicao do vetor
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            vetor1[i] = num;
            soma += vetor1[i];
        }
        double media = soma / veto1.length;
        System.out.println("A Média dos números é : "+ media);
    }
}