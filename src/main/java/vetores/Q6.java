/*Q6 - Faça a impressão das idades entre 18 e 90.*/

package vetores;

public class Q6 {
    static int idades[] = {22, 17, 14, 33, 57, 23, 32, 65, 70, 16, 17, 18, 15, 20, 21, 27, 12, 10, 25};
    static int cont;


    public static void impressao() {
        System.out.println();
        System.out.println( "Numeros entre 18 e 90:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18 && idades.length <= 90) {
                System.out.printf(idades[i] + " ");
            }
        }
    }
}


