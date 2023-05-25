package Vetores;

import java.util.Scanner;

public class MediaAltura {
    public static void altura(){
            Scanner sc = new Scanner(System.in);
            int n;

            System.out.println("Quantas pessoas serão digitadas: ");
            n = sc.nextInt();

            int vetor[] = new int[n];

            for (int i = 0; i < n; i++){
                System.out.println("Digite o nome: ");
                sc.nextLine();
                System.out.println("Digite a idade: ");
                sc.nextInt();
                System.out.println("Digite a altura");
                sc.nextDouble();
            }

            for (int i = 0; i < n; i++){
            }
    }
}
