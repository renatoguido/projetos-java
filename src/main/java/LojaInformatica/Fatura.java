package LojaInformatica;

public class Fatura {

    String numero;
    String descricao;
    int quantidadeCompras;
    double preco;

    public Fatura(String numero, String descricao, int quantidadeCompras, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidadeCompras = quantidadeCompras;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeCompras() {
        return quantidadeCompras;
    }

    public double getPreco() {
        return preco;
    }

    public double getTotalFatura(){
        double totalFatura = quantidadeCompras * preco;
        return totalFatura;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidadeCompras(int quantidadeCompras) {
        this.quantidadeCompras = quantidadeCompras;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "=========================================" +
                "\nNumero do Produto: " + numero +
                "\nDescrição: " + descricao +
                "\nPreço: R$" + preco +
                "\nQuantidade: " + quantidadeCompras +
                "\nTotal da compra: R$" + getTotalFatura() +
                "\n=========================================";
    }
}
