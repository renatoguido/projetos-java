import java.util.Random;

    public class Colaborador {

        static String nome;
        static String cpf;
        static int idade;
        static String cargo;
        static int id;

        public Colaborador(String nome, int id, String cpf, int idade, String cargo) {
            this.nome = nome;
            this.id = id;
            this.cpf = cpf;
            this.idade = idade;
            this.cargo = cargo;
        }


        public static String getCpf() {
            return cpf;
        }

        public static void setCpf(String cpf) {
            ColaboradorScan.cpf = cpf;
        }

        public static int getIdade() {
            return idade;
        }

        public static void setIdade(int idade) {
            ColaboradorScan.idade = idade;
        }

        public static String getCargo() {
            return cargo;
        }

        public static void setCargo(String cargo) {
            ColaboradorScan.cargo = cargo;
        }

        public static int getId() {
            return id;
        }

        public static void setId(int id) {
            ColaboradorScan.id = id;
        }

        public static String getNome() {
            return nome;
        }

        public static void setNome(String nome) {
            ColaboradorScan.nome = nome;
        }

        public static int gerarId(){
            Random numId = new Random();
            while (id < 100000 || id > 999999){
                id = numId.nextInt();
            }
            return id;
        }

        @Override
        public String toString() {
            return  "============FICHA DO COLABORADOR===============" +
                    "\nNome do colaborador: " + nome +
                    "\nNumero de matricula: " + gerarId() +
                    "\nCPF: " + cpf +
                    "\nIdade: " + idade +
                    "\nCargo: " + cargo +
                    "\n=================================================";
        }
    }
