package Funcionarios;

public class Assistente extends Funcionarios{
    int numMatricula;
    double bonus;
    double adicionalNoturno;

    public Assistente(int n, String nome, String cpf, String rg, double salario){
        super(nome, cpf, rg, salario);
        this.numMatricula = n;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        bonus = bonus * salario;
        this.bonus = bonus;
    }
    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        adicionalNoturno = adicionalNoturno * salario;
        this.adicionalNoturno = adicionalNoturno;
    }



    @Override
    public String toString() {
        return "\nAssistente:" +
                "\nNome: " + nome +
                "\nCPF: '" + cpf  +
                "\nRG: " + rg +
                "\nNumero de matricula: " + numMatricula +
                "\nSalario: " + salario +
                "\nCom bonus: " + bonus +
                "\nCom adicional noturno: " + adicionalNoturno;
    }
}
