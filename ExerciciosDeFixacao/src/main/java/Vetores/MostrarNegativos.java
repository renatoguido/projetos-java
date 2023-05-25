package Vetores;

import java.util.Scanner;

public class MostrarNegativos {

    public static void armazenarNumeros(){
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();

        int vetor[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < n; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
    }
}
