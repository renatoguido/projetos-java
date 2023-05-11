/*
Q2 - Declare e inicialize um vetor da classe com os valores dado acima. Declare uma variável
da classe de nome 'contadorDeNegativos'. Crie um método que toda vez que exitir um número
negativo no vetor, o contador recebe ele mesmo mais 1. O método deve retornar a quantidade
de números negativos existente no vetor.
*/

public class Questao2 {
    static int[] nums = {-34, -72, 23, -81, 2, 109, 21, -12, 43, -26, -31};
    static int cont;


    public static void contadorDeNegativos(int i, int num) {
        for (i = i; i < num; i++) {
            if (nums[i] < 0) {
                cont = 1 + cont;
            }
        }
        System.out.println("Numeros negativos: "+ cont);

    }


}
