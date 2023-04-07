package InformacoesPessoas;

import java.util.ArrayList;

public class Informacoes {

    public static void Array(){
        ArrayList<String> pessoas = new ArrayList<String>();

        //Adiciona um valor ao Array...
        pessoas.add("Renato");
        pessoas.add("Samuel");
        pessoas.add("Thiago");

        /* Remove todos os itens da Array
        pessoas.clear();
         */

        //Mostra os valores adicionados...
        System.out.println(pessoas.toString());

        //Imprime apenas uma posiçao do array..
        System.out.println(pessoas.get(1));


    }

}
