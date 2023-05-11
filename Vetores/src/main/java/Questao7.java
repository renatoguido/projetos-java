/*
Q7 - Faça a impressão da soma das idades.
Q8 - Faça a impressão da média das idades. (Dica: soma / idades.length)
*/

public class Questao7 {
    static int idades[] = {22, 17, 14, 33, 57, 23, 32, 65, 70, 16, 17, 18, 15, 20, 21, 27, 12, 10, 25};
    static int i;
    static int soma;



    public static int adicao(){
        System.out.println();
        for (int i = 0; i < idades.length; i++) {
            soma = soma + idades[i];

        }
        System.out.println("Soma das idades:" + soma);
        return soma;
    }

    public static int divisao(){
        System.out.println();
        int media;
        media = soma / idades.length;
        System.out.println("Media das idades:" + media);
        return media;
    }
}