import java.util.Scanner;

public class SomaDeVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declarando os vetores em branco
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int[] resultado = new int[vetor1.length];

        // Recebendo os valores que o usuário digitar e armazenar dentro do vetor
        // armazenar na posição "i", que começa de zero e vai até a última posicao do vetor
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite um valor para o vetor 1");
            int num = sc.nextInt();
            vetor1[i] = num;
        }
        // Adicionando no segundo vetor
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite um valor para o vetor 2");
            int num = sc.nextInt();
            vetor2[i] = num;
        }

        // Acessando as posicoes dos dois vetores, somando os valores e salvando no vetor de resultado
        for (int i = 0; i < vetor1.length; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }
        
        // Mostrando a soma dos vetores (vetor resultado)
        System.out.println("Resultado da soma dos vetores:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println("Elemento " + (i+1) + ": " + resultado[i]);
        }
        
    }
}
