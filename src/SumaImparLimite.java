import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un limite inferior (entero positivo): ");
        int min = sc.nextInt();

        System.out.println("Escribe un limite superior (entero positivo): ");
        int max = sc.nextInt();

        int acumulador = 0;//guardando la suma de los impares entre los limites
        for (int i = min; i <= max; i=i+1) {//no se especifica si debe contener o no el nro si este es impar
            if (i % 2 != 0){//asegurarse que sea impar, osea modulo distinto a 0 o resto distinto a 0
                acumulador = acumulador +i;
             }
        }

        System.out.println(acumulador);

    }
}

