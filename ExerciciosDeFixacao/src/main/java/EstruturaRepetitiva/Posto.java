package EstruturaRepetitiva;
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

import java.util.Scanner;

public class Posto {

    public static void combustiveis() {
        Scanner sc = new Scanner(System.in);
        int tipoCombustivel;
        int maxCombustivel = 4;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Qual o tipo de combstivel:\n" +
                "1 - Alcool\n" +
                "2 - Gasolina\n" +
                "3 - Diesel\n");
        tipoCombustivel = sc.nextInt();


        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1) {
                alcool = alcool + 1;
            } else if (tipoCombustivel == 2) {
                gasolina = gasolina + 1;
            } else if (tipoCombustivel == 3) {
                diesel = diesel + 1;
            }
            tipoCombustivel = sc.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
