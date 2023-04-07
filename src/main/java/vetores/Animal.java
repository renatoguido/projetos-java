package vetores;

import java.util.Scanner;

    public class Animal{

        public static String nome;
        public static double comprimento;
        public static String cor;

        public static void animal(){
            Scanner sc = new Scanner(System.in);

            System.out.printf("Qual nome do animal:");
            nome = 	sc.next();

            System.out.printf("Qual o comprimento do animal:");
            comprimento = sc.nextDouble();

            System.out.printf("Qual a cor do animal:");
            cor = sc.next();
        }

        public static void imprimirAnimal(){
            System.out.println("O " +nome + " tem " + comprimento + "e sua cor é: " +cor);
        }
    }
