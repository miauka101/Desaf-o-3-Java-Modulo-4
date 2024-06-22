import java.util.Scanner;
public class SoloPares2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Coloca un numero entero positivo:");
        int n= sc.nextInt();

        for (int i=1; i < n + 1 ; i++) {
            System.out.println(2*i);
        }
    }
}
