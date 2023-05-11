public class Excecao {

    static String[] vetor = {"Sao Paulo", "Corinthians", "Santos", "Palmeiras"};

    public static void funcao(){
        try {
            for (int i = 0; i < vetor.length ; i++) {
                System.out.println(vetor[1] + " x " + vetor[2]);
                System.out.println(vetor[3] + " x " + vetor[4]);
            }
        } catch (Exception exception) {
            System.err.println("Posição não existe");
            System.err.println(exception);
        }

        System.out.println("São Paulo Campeão !!");

    }
}