package EstruturaCondicional;
/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.*/

import java.util.Scanner;

public class Impostos {
    public static void calculo(){
        Scanner sc = new Scanner(System.in);
        double salario;
        double imposto;
        double valorFinal;


        System.out.println("Qual o salario do cidadão?: ");
        salario = sc.nextDouble();

        if (salario <= 2000){
            System.out.println("Insento");
        }
        else if(salario > 2001 && salario <= 3000){
            imposto = salario - 1000 * 0.08;
            valorFinal = salario - imposto;

            System.out.println("A taxa de 8% sobre R$"+salario+" Resulta em: R$"+valorFinal);
        }
        else if (salario > 3001 && salario <= 4500) {
            imposto = salario - 1000 * 0.18;
            valorFinal = salario - imposto;

            System.out.println("A taxa de 18% sobre R$" + salario + " Resulta em: R$" + valorFinal);
        }
        else{
            imposto = salario - 1000 * 0.28;
            valorFinal = salario - imposto;

            System.out.println("A taxa de 28%% sobre R$"+salario+" Resulta em: R$"+valorFinal);
        }
    }

}
