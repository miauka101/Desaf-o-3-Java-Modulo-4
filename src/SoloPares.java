import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Coloca un numero entero positivo:");
        int n= sc.nextInt();

        for (int i=0; i < n; i++) {
            System.out.println(2 * i);
        }


    }
}
