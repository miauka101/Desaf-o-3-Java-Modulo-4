import java.util.Scanner;
public class SumaImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Coloca un numero entero positivo:");
        int n = sc.nextInt();

        int acumulador = 0;//guardar la suma de los impares
        for (int i = 1; i <= n; i=i+2) {//no se especifica si debe contener o no el nro si este es impar
            acumulador = acumulador +i;
        }
        System.out.println(acumulador);


 }
}