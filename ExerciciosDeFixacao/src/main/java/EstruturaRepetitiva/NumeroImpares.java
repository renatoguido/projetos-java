package EstruturaRepetitiva;
/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.*/
import java.util.Scanner;

public class NumeroImpares {
    public static void numeros() {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

}
