public class Arrays {
    public static void main(String[] args) throws Exception {
        // Arrays
        int[] numeros3 = {1, 2, 3, 4, 5};  // Array já com valores na declaração
        int[] numeros;  // Declaração de um array de inteiros
        numeros = new int[5];  // Inicialização com 5 elementos
        // Ou podemos fazer tudo junto
        int [] numeros2 = new int[5];
        // Acessando valores
        System.out.println(numeros[0]); // Acessando o primeiro elemento (índice 0)
        numeros[2] = 10;  // Modificando o valor no índice 2
        System.out.println(numeros[2]);  // Exibe: 10
        // Acessando todas as posições usando uma repetição
        // o length pega o tamanho do vetor automaticamente
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}