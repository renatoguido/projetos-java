package ContaBancaria;

public class ContaPoupanca extends Conta{

    static double rendimento;
    double novoSaldo;


    public ContaPoupanca(String c, int n, double s){
        super(c,n,s);
        rendimento = 0.02;
    }

    public double getRendimento(){
        return novoSaldo;
    }

    public  void setRendimentos(int dia) {
        novoSaldo = saldo * rendimento;
            System.out.println("Em " + dia + " dias, seu rendimento será de: R$" + novoSaldo);
        }
}

