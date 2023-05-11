import java.util.Scanner;

    public class Main {
        public static void main(String Args[]) {

            Scanner std = new Scanner(System.in);
            System.out.println("Digite o nome do colaborador: ");
            String tempNome = std.next();
            System.out.println("CPF do colaborador: ");
            String tempCpf = std.next();
            System.out.println("Idade: ");
            int tempIdade = std.nextInt();
            System.out.println("Cargo: ");
            String tempCargo = std.next();

            Colaborador c1 = new Colaborador(tempNome, Colaborador.gerarId(),tempCpf, tempIdade, tempCargo);
            System.out.println(c1);

        }
    }