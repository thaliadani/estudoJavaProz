public class contador {
    public static void main(String[] args) {

        System.out.println("Usando while");

        int contador = 1;

        while (contador<= 10){
            System.out.println(contador);
            contador++;
        }

        System.out.println("-----------------------------------------");

        contador = 10;

        while (contador>= 1){
            System.out.println(contador);
            contador--;
        }

        System.out.println("-----------------------------------------");

        System.out.println("Usando for");

        for (int i = 1; i<=10; i+=1){
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");

        for (int i = 10; i>=1; i-=1){
            System.out.println(i);
        }
    }
}
