import java.util.Random;
import java.util.Scanner;

    public class ColaboradorScan {
        static String nome;
        static String cpf;
        static int idade;
        static String cargo;
        static int id;

        //

        public ColaboradorScan() {
        }



    /*
    public static void entradaDeDados(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o nome do colaborador: ");
        nome = sc.next();
        System.out.printf("CPF do colaborador: ");
        cpf = sc.next();
        System.out.printf("Qual a idade do colaborador: ");
        idade = sc.nextInt();
        System.out.printf("Qual o cargo do colaborador: ");
        cargo = sc.next();
    }
    //*/

        public static int gerarId(){
            Random numId = new Random();
            while (id < 100000 || id > 999999){
                id = numId.nextInt();
            }
            return id;
        }


        public static void impressao() {
            System.out.println( "============FICHA DO COLABORADOR===============" +
                    "\nNome do colaborador: " + nome +
                    "\nNumero de matricula: " + gerarId() +
                    "\nCPF: " + cpf +
                    "\nIdade: " + idade +
                    "\nCargo: " + cargo +
                    "\n=================================================");
        }
    }
