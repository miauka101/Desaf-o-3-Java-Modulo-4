public class CambiarWhile {
    public static void main(String[] args) {

       /*int i = 0;
        while (i<50) {
            i+=1;
            System.out.printf("Iteración %d\n", i);
        }
    }*/

        int i = 0;

        do {
            i+=1;
                System.out.println("Iteracion "+ i); //lo queria hacer conprintf pero me salia alreves 45iteracion asi
        } while (i<50);                             //asique lo deje con println y concatenando me dejaba
     }
}
