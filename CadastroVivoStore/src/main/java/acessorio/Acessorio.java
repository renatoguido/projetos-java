package acessorio;


import produto.Produto;

public class Acessorio extends Produto {

    String material;
    String conector;
    String protecao;

    public Acessorio() {
    }

    public Acessorio(String nomeProduto, int idProduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, String conector, String material, String protecao) {
        super(nomeProduto, idProduto, marcaProduto, corProduto, descricaoProduto, precoProduto);
        this.material = material;
        this.conector = conector;
        this.protecao = protecao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public String getProtecao() {
        return protecao;
    }

    public void setProtecao(String protecao) {
        this.protecao = protecao;
    }
}
