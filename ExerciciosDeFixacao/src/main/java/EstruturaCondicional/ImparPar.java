package EstruturaCondicional;
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */

import java.util.Scanner;

public class ImparPar {
    public static void imparPar(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero:");
        sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");
        }
        else {
            System.out.println("o numero é impar");
        }
    }
}
