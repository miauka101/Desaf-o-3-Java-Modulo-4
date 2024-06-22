import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números de la secuencia que deseas ver:");
        int cantidad = sc.nextInt();

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

        int a = 0; //partida
        int b = 1; //partida

        for (int i = 0; i <= cantidad; i++) {
            System.out.printf("%d ", a);

            int f = a + b;
            a = b;
            b = f;
        }

    }
}
