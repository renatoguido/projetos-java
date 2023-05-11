public class Main {
    public static void main(String args[]){

        Conta conta1 = new Conta("Renato",  1832940, 200);
        System.out.println("Nome do titular: " + conta1.cliente);
        System.out.println("Numero da conta: " + conta1.num_conta);
        conta1.depositar(3823);
        conta1.saque(0);
        System.out.println("Seu saldo atual é de: R$" + conta1.saldo);

        ContaPoupanca poupanca = new ContaPoupanca("Renato", 1832940, conta1.getSaldo());
        poupanca.setRendimentos(2);
        poupanca.getRendimento();

        ContaEspecial credito = new ContaEspecial("Renato",1832940, conta1.getSaldo());
        credito.getLimite();

    }
}