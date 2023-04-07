package Funcionarios;

public class Gerente extends Funcionarios{
    double aumentoGerencia;



    public Gerente(String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
    }

    public double getAumentoGerencia() {
        return aumentoGerencia;
    }

    public void setAumentoGerencia(double aumentoGerencia) {
        aumentoGerencia = salario * aumentoGerencia;
        this.aumentoGerencia = aumentoGerencia;
    }

    @Override
    public String toString() {
        return "\nGerente:" +
                "\nNome: " + nome +
                "\nCPF: '" + cpf  +
                "\nRG: " + rg +
                "\nSalario: " + salario +
                "\nAumento: " + aumentoGerencia +
                "\nValor bruto:" + valorBruto;
    }
}
