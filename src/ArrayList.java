import java.util.ArrayList;
import java.util.Scanner;
public class TesteArrayList {
    public static void main(String[] args) {
        
        // Criando um ArrayList de inteiros
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5;i++){
            System.out.println("Digite um número");
            int num = sc.nextInt();
            lista.add(num);
        }
        
        // Exibindo os elementos
        System.out.println("Elementos do ArrayList:");
        for (int y=0; y<5;y++) {
            System.out.println(lista.get(y));
        }
        System.out.println(lista);
    }
}