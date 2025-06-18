import java.util.*;

public class MaiorElementoVetor {
    public static void main(String[] args) {
      int[] numeros = new int[5];
      int maior = 0;
      
      for(int= 0; i < numeros.length; i++){
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        numeros[i] = num;
      }
      
      for(int = 0; i< numeros.length; i++ ){
        if (numeros[i]>maior){
          maior = numeros[i]
        }
      }
      
    System.out.println("O maior número é "+ maior);
  }
