package Animal;

public class Main {
    public static void main (String args[]){
        Animal animal = new Animal("Camelo", "Terra", 150, "Amarelo", 2.0, 4);
        System.out.println(animal);

        Mamifero mamifero = new Mamifero("Urso-do-Canadá", "Terra", 180, "Vermelho", 0.5, 4, "Mel");
        System.out.println(mamifero);

        Peixe peixe = new Peixe("Tubarao", "Agua", 300, "Cinzento", 1.5, 0, "Barbatanas e caudas");
        System.out.println(peixe);




    }
}
