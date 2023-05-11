import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    String nomeE;
    ArrayList<String> nome = new ArrayList<>();
    ArrayList<Double> salario = new ArrayList<>();
    ArrayList<Object> todos = new ArrayList<>();

    int respostaMenu;
        do { System.out.println("Cadastro: ");
        System.out.println("");
        System.out.println("Digite as informaçoes");
        System.out.println("Nome: ");
        sc.nextLine();
        nomeE = sc.nextLine();
        nome.add(nomeE); System.out.println("Salario: ");
        salario.add(sc.nextDouble());
        System.out.println("Cadastrar nova pessoa?: ");
        System.out.println("1- Sim");
        System.out.println("2- Nao");
        respostaMenu = sc.nextInt(); } while(respostaMenu == 1);

        System.out.println("Pessoas cadastradas: ");

        for (int i = 1; i < nome.size(); i++) { System.out.println("Nome: " + nome.get(i)); System.out.println("Salario: " + salario.get(i)); } }
}
