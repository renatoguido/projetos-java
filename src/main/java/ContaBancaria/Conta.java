package ContaBancaria;

import java.util.Scanner;

public class Conta {

    static String cliente;
    static int num_conta;
    double saldo;

    public Conta(){
    }


    public Conta(String c, int n, double s){
        this.cliente = c;
        this.num_conta = n;
        this.saldo = s;

    }

    public Double getSaldo(){
        return saldo;
    }

    public void saque(int sacar){
            saldo = saldo - sacar;
    }

    public void depositar(int deposito){
            saldo = saldo + deposito;
    }
}
