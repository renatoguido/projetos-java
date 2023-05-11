public class Funcionarios {
    String nome;
    String cpf;
    String rg;
    double aumento;
    public double novoAumento;
    double salario;
    double valorBruto;

    public Funcionarios(String nome, String cpf, String rg, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        novoAumento = salario * aumento;
        this.aumento = aumento;
    }

    public double getNovoAumento() {
        return novoAumento;
    }

    public void setNovoAumento(double novoAumento) {
        novoAumento = salario * aumento;
        this.novoAumento = novoAumento;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        valorBruto = salario + novoAumento;
        this.valorBruto = valorBruto;
    }

    @Override
    public String toString() {
        return "\nFuncionario:" +
                "\nNome: " + nome +
                "\nCPF: '" + cpf  +
                "\nRG: " + rg +
                "\nSalario: " + salario +
                "\nAumento: " + novoAumento +
                "\nValor Bruto:" + valorBruto;
    }
}