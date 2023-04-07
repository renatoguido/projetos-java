package Animal;

public class Mamifero extends Animal {
    public String alimento;


    public Mamifero(String animal, String ambiente, double comprimento, String cor, double velocidade, int patas, String alimento) {
        super(animal, ambiente, comprimento, cor, velocidade, patas);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "\nAnimal: " + animal +
                "\nAmbiente: " + ambiente +
                "\nComprimento: " + comprimento + " cm" +
                "\nQuantidade de patas: " + patas +
                "\nCor: " + cor +
                "\nVelocidade: " + velocidade + " m/s" +
                "\nAlimento: " + alimento +
                "\n==========================";
    }
}
