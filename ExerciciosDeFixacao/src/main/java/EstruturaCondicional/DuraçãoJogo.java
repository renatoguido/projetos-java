package EstruturaCondicional;
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class DuraçãoJogo {

    public static void jogo() {
        Scanner sc = new Scanner(System.in);
        int duracaoJogo;
        int inicioJogo;
        int fimJogo;

        System.out.println("Horario de inicio do jogo: ");
        inicioJogo = sc.nextInt();

        System.out.println("Horio de fim do jogo ");
        fimJogo = sc.nextInt();

        duracaoJogo = fimJogo + inicioJogo;

        if (inicioJogo < fimJogo){
            duracaoJogo = fimJogo - inicioJogo;
        }
        else {
            duracaoJogo = 24 - inicioJogo + fimJogo;
        }
        System.out.println("O jogo durou " + duracaoJogo + " hora(s)");

    }
}
