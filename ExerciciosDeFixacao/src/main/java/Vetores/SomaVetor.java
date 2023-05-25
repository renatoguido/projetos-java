package Vetores;

import java.util.Scanner;

public class SomaVetor {

    public static void somaVetor(){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar");
        n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros Digitados");
        for(int i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }

        int soma = 0;
        int media = 0;
        for (int i = 0; i < n; i++){
            soma = soma + vetor[i];
            media = soma / n;
        }

        System.out.println("Soma dos numeros: " + soma);
        System.out.println("Media dos numeros: " + media);

    }
}
