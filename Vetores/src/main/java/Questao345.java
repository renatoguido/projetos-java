/*
Q3 - Faça a impressão das idades maiores que 20 em sua classe. (Dica: idades[i] > 20)
Q4 - Faça a impressão das idades menores que 40. (Dica: idades[i] < 40)
Q5 - Faça a impressão das idades entre 20 e 40. (Dica: idades[i] >= 20 && idades[i] <= 40)
*/
package vetores;

public class Questao345 {

    static int idades[] = {22, 17, 14, 33, 57, 23, 32, 65, 70, 16, 17, 18, 15, 20, 21, 27, 12, 10, 25};
    static int cont;



    public static void maiorDe20(){
        System.out.println( "Numeros maiores de 20:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 20) {
                System.out.printf(idades[i] + " ");
            }
        }

    }

    public static void menorDe40(){
        System.out.println();
        System.out.println("Numeros menores de 40:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] < 40) {
                System.out.printf(idades[i] + " ");

            }
        }
    }

    public static void ambos() {
        System.out.println();
        System.out.println("Idades entre 20 e 40:");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 20 && idades[i] <= 40) {
                System.out.printf(idades[i] + " ");

            }
        }
    }

}