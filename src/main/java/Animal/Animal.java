package Animal;

public class Animal {
    public String animal;
    public String ambiente;
    public double comprimento;
    public String cor;
    public double velocidade;
    int patas;


    public Animal(String animal, String ambiente, double comprimento, String cor, double velocidade, int patas) {
        this.animal = animal;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.cor = cor;
        this.velocidade = velocidade;
        this.patas = patas;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "\n==========================" +
                "\nAnimal: " + animal +
                "\nAmbiente: " + ambiente +
                "\nComprimento: " + comprimento + " cm" +
                "\nQuantidade de patas: " + patas +
                "\nCor: " + cor +
                "\nVelocidade: " + velocidade + " m/s" +
                "\n==========================";

    }

}

