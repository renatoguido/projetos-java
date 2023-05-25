package EstruturaCondicional;
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

import java.util.Scanner;

public class NumerosMultiplos {

    public static void numerosMultipos(){
        Scanner sc = new Scanner(System.in);
        int numeroA = 0;
        int numeroB = 0;
        System.out.println("Digite um numero: ");
        sc.nextInt();
        System.out.println("Digite outro numero: ");
        sc.nextInt();

        if (numeroA % numeroB == 0 || numeroB % numeroA == 0){
            System.out.println("Os numeros são multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
    }
}
