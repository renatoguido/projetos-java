package EstruturaRepetitiva;
/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Scanner;

public class Cordenadas {
    public static void planoCartesiano(){
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Digite as coordenadas do Eixo X: ");
        x = sc.nextInt();
        System.out.println("Digite as coordenadas do Eixo Y: ");
        y = sc.nextInt();

        while (x > 0 && y > 0){
            System.out.println("Primeiro");
            System.out.println("Digite as coordenadas do Eixo X: ");
            x = sc.nextInt();
            System.out.println("Digite as coordenadas do Eixo Y: ");
            y = sc.nextInt();
        }
        while (x < 0 && y > 0){
            System.out.println("Segundo");
            System.out.println("Digite as coordenadas do Eixo X: ");
            x = sc.nextInt();
            System.out.println("Digite as coordenadas do Eixo Y: ");
            y = sc.nextInt();
        }
        while (x < 0 && y < 0){
            System.out.println("Terceiro");
            System.out.println("Digite as coordenadas do Eixo X: ");
            x = sc.nextInt();
            System.out.println("Digite as coordenadas do Eixo Y: ");
            y = sc.nextInt();
        }
        while (x > 0 && y < 0){
            System.out.println("Quarto");
            System.out.println("Digite as coordenadas do Eixo X: ");
            x = sc.nextInt();
            System.out.println("Digite as coordenadas do Eixo Y: ");
            y = sc.nextInt();
        }

    }
}
