public class Main {

    public static void main(String args[]) {
        Funcionarios funcioario = new Funcionarios("Renato", "525.553.750-10", "53.820.204-1", 1201);
        funcioario.getNovoAumento();
        funcioario.setAumento(0.10);
        funcioario.getValorBruto();
        funcioario.setValorBruto(funcioario.salario);
        System.out.println(funcioario);

        Gerente gerencia = new Gerente("Joao", "525.333.444-20", "43.546.456-2", 3000);
        gerencia.getAumentoGerencia();
        gerencia.setAumentoGerencia(0.15);
        System.out.println(gerencia);

        Assistente assistente = new Assistente(15421, "Daniel", "333.222.444.-23", "45.633.444-2", 1930);
        assistente.getBonus();
        assistente.setBonus(0.25);
        assistente.getAdicionalNoturno();
        assistente.setAdicionalNoturno(0.35);
        System.out.println(assistente);
    }
}