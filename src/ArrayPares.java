import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPares {
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        // Criar um vetor com 10 números digitados pelo usuário
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Deseja digitar mais um número?");
            System.out.println("Digite s para sim e n para não");
            String op = sc.next();
            if(op.equals("s")){
                System.out.println("Digite um valor: ");
                int num = sc.nextInt();
                lista.add(num);
            }else{
                System.out.println("Saindo do programa");
                break;
            }
        }
        System.out.println("Imprimindo lista: ");
        for(int i =0; i < lista.size(); i ++){
            System.out.print(" - "+lista.get(i));
        }
    }
}