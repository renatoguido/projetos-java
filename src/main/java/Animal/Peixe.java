package Animal;

public class Peixe extends Animal{
    String caracteristicas;

    public Peixe(String animal, String ambiente, double comprimento, String cor, double velocidade, int patas, String caracteristicas) {
        super(animal, ambiente, comprimento, cor, velocidade, patas);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "\nAnimal: " + animal +
                "\nAmbiente: " + ambiente +
                "\nComprimento: " + comprimento + " cm" +
                "\nQuantidade de patas: " + patas +
                "\nCor: " + cor +
                "\nVelocidade: " + velocidade + " m/s" +
                "\nCaracteristicas: " + caracteristicas +
                "\n==========================";
    }
}
