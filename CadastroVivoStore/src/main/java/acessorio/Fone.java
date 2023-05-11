package acessorio;

public class Fone extends Acessorio{

    public Fone(String nomeProduto, int idProduto, String marcaProduto, String corProduto, String descricaoProduto, double precoProduto, String conector, String material, String protecao) {
        super(nomeProduto, idProduto, marcaProduto, corProduto, descricaoProduto, precoProduto, conector, material, protecao);
    }

    @Override
    public String toString() {
        return  "\n=========PRODUTO CADASTRADO=========" +
                "\nProduto: " + getNomeProduto() +
                "\nCodigo: " + getIdProduto() +
                "\nMarca: " + getMarcaProduto() +
                "\nMaterial: " + getMaterial() +
                "\nCor: " + getCorProduto() +
                "\nTipo de conexão: " + getConector() +
                "\nValor: R$" + getPrecoProduto() +
                "\nDescrição do produto: " + getDescricaoProduto()+
                "\n==================================================\n";
    }
}
