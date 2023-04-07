package ContaBancaria;

public class ContaEspecial extends Conta {

    public double limite;



    public ContaEspecial(String c, int n, double s){
        super (c,n,s);
        limite = 1200;
    }

    public double getLimite(){
        return limite;
    }

    public void setlimite(){
        if (getSaldo() <= 0){
            System.out.println("Credito disponibilizado: R$" + limite);
        }

    }

}
