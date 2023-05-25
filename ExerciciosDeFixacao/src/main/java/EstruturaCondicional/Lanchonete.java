package EstruturaCondicional;
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
Cachorro quente = 1, R$4,00
X-Salada = 2, R$4,50
X-Bacon = 3, R$5,00
Torrada = 4, R$2,00
Refrigerante = 5, R$1,50*/

import java.util.Scanner;

public class Lanchonete {
    public static void conta(){
        Scanner sc = new Scanner(System.in);
        int quantidadeProduto;
        int item;
        double valorFinal = 0;

        System.out.println("Digite o codigo do item desejado:\n" +
                "1 - Cachorro quente (R$4,00)\n" +
                "2 - X-Salada (R$4,50)\n" +
                "3 - X-Bacon (R$5,00)\n" +
                "4 - Torrada (R$2,00)\n" +
                "5 - Refrigerante (R$1,50)");
        item = sc.nextInt();

        System.out.println("Quantidade: ");
        quantidadeProduto = sc.nextInt();

        if(item == 1){
            System.out.println("Você selecionou "+ quantidadeProduto + " Cachorro quente(s)");
            valorFinal = quantidadeProduto * 4;
        }
        else if(item == 2){
            System.out.println("Você selecionou "+ quantidadeProduto + " X-Salada(s)");
            valorFinal = quantidadeProduto * 4.50;
        }
        else if(item == 3){
            System.out.println("Você selecionou "+ quantidadeProduto + " X-Bacon(s)");
            valorFinal = quantidadeProduto * 5;
        }
        else if(item == 4){
            System.out.println("Você selecionou "+ quantidadeProduto + " Torrada(s)");
            valorFinal = quantidadeProduto * 2;
        }
        else if(item == 5){
            System.out.println("Você selecionou "+ quantidadeProduto + " Refrigentante(s)");
            valorFinal = quantidadeProduto * 1.50;
        }
        else {
            System.out.println("Digite um item valido");
        }

        System.out.println("Valor total: R$" + valorFinal);
    }
}
