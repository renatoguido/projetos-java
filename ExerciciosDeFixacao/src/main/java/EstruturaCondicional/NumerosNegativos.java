package EstruturaCondicional;
/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class NumerosNegativos {

    public static void numerosNegativos (){
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        System.out.println("Digite um numero: ");
        sc.nextInt();

        if(numeros >= 0){
            System.out.println("Numero Positivo!");
        }
        else {
            System.out.println("Numero Negativo");
        }
    }
}
