import java.util.Scanner;

public class classificaoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o comprimento do segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os lados do triângulo devem ser maiores que zero.");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}
