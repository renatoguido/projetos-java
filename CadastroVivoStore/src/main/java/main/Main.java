package main;

import acessorio.Capinha;
import acessorio.Carregador;
import acessorio.Fone;
import condicao.Condicao;
import smartphone.Apple;
import smartphone.Motorola;
import smartphone.Samsung;
import textoCadastro.TextoCadastro;
import dados.Dados;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int escolha = 0;
    static int indexAux = 1;

    public static void main(String args[]) {

        TextoCadastro.textoInicial();
        menu();
        salvar();
        System.out.println(Dados.produtos);

    }

    public static void menu () {

        while (true) {
            try {
                System.out.println("Escolha uma das opcoes: ");
                System.out.println("1- Cadastrar Produto");
                System.out.println("2- Adicionar Produto");
                System.out.println("3- Remover Produto");
                System.out.println("4- Consultar Produto");
                System.out.println("5- Sair");
                System.out.println("\nEscolha uma opçao: ");
                escolha = sc.nextInt();

                while (escolha < 1 || escolha > 6) {
                    System.out.println("Produto nao encontrado, digite um valor em 1 e 6.");
                    escolha = sc.nextInt();
                }

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Por favor, digite um valor válido inteiro. Tente novamente.");
            }

            if (escolha == 1) {
                TextoCadastro.adquirirQuantidadeProdutos();
                decisaoUsuario();
                menu();
            } else if (escolha == 2) {
                Condicao.escolhaAdicionarProduto();
                menu();
            } else if (escolha == 3) {
                Condicao.removerProduto();
                menu();
            } else if (escolha == 4) {
                Condicao.consultarProduto();
                menu();
            } else {
                System.out.println("Saindo...");
            }
            break;
        }
    }

    public static int gerarID() {
        Random valor = new Random();
        int iDproduto = valor.nextInt();
        while (iDproduto < 1000 || iDproduto > 9999) {
            iDproduto = valor.nextInt();
        }
        return iDproduto;
    }

    public static void decisaoUsuario() {

        for (int i = 1; i <= TextoCadastro.quantidadeProdutosCadastro; i++) {

            int escolhaUsuario;
            System.out.println("\nPRODUTO Nº "+ indexAux);

            while (true) {
                try {
                    System.out.println("Escolha o item que deseja cadastrar: ");
                    System.out.println("1- Smartphone");
                    System.out.println("2- Motorola");
                    System.out.println("3- Samsung");
                    System.out.println("4- Carregador");
                    System.out.println("5- Case");
                    System.out.println("6- Fone\n");
                    escolhaUsuario = sc.nextInt();
                    while (escolhaUsuario < 1 || escolhaUsuario > 6){
                        System.out.println("Produto nao encontrado, digite um valor em 1 e 6.");
                        escolhaUsuario = sc.nextInt();
                    }
                    break;
                } catch (InputMismatchException e) {
                    sc.nextLine();
                    System.out.println("Por favor, digite um valor válido inteiro. Tente novamente.");
                }
            }

            switch (escolhaUsuario) {
                case 1:
                    Condicao.informacoesCelular();
                    Apple apple = new Apple(
                            Condicao.nomeProduto,
                            gerarID(),
                            Condicao.marcaProduto,
                            Condicao.corProduto,
                            Condicao.descricaoProduto,
                            Condicao.precoProduto,
                            Condicao.tamanhoMemoriaRam,
                            Condicao.tamanhoMemoria,
                            Condicao.tamanhoTela,
                            Condicao.tipoTela
                    );
                    Dados.produtos.add(apple);
                    break;

                case 2:
                    Condicao.informacoesCelular();
                    Motorola motorola = new Motorola(
                            Condicao.nomeProduto,
                            gerarID(),
                            Condicao.marcaProduto,
                            Condicao.corProduto,
                            Condicao.descricaoProduto,
                            Condicao.precoProduto,
                            Condicao.tamanhoMemoriaRam,
                            Condicao.tamanhoMemoria,
                            Condicao.tamanhoTela,
                            Condicao.tipoTela
                    );
                   Dados.produtos.add(motorola);
                   break;

                case 3:
                    Condicao.informacoesCelular();
                    Samsung samsung = new Samsung(
                            Condicao.nomeProduto,
                            gerarID(),
                            Condicao.marcaProduto,
                            Condicao.corProduto,
                            Condicao.descricaoProduto,
                            Condicao.precoProduto,
                            Condicao.tamanhoMemoriaRam,
                            Condicao.tamanhoMemoria,
                            Condicao.tamanhoTela,
                            Condicao.tipoTela
                    );
                    Dados.produtos.add(samsung);
                    break;

                case 4:
                    Condicao.informacoesAcessorio();
                    Carregador carregador = new Carregador(
                            Condicao.nomeProduto,
                            gerarID(),
                            Condicao.marcaProduto,
                            Condicao.corProduto,
                            Condicao.descricaoProduto,
                            Condicao.precoProduto,
                            Condicao.conector,
                            Condicao.tipoMaterial,
                            Condicao.protecao
                    );
                    Dados.produtos.add(carregador);
                    break;

                case 5:
                    Condicao.informacoesAcessorio();
                    Capinha capinha = new Capinha(
                            Condicao.nomeProduto,
                            gerarID(),
                            Condicao.marcaProduto,
                            Condicao.corProduto,
                            Condicao.descricaoProduto,
                            Condicao.precoProduto,
                            Condicao.conector,
                            Condicao.tipoMaterial,
                            Condicao.protecao
                    );
                    Dados.produtos.add(capinha);
                    break;

                case 6:
                    Condicao.informacoesAcessorio();
                    Fone fone = new Fone(
                            Condicao.nomeProduto,
                            gerarID(),
                            Condicao.marcaProduto,
                            Condicao.corProduto,
                            Condicao.descricaoProduto,
                            Condicao.precoProduto,
                            Condicao.conector,
                            Condicao.tipoMaterial,
                            Condicao.protecao
                    );
                    Dados.produtos.add(fone);
                    break;
            }
            indexAux++;
        }
        System.out.println(Dados.produtos);
    }

    public static String salvar() {
        try {
            FileWriter fw = new FileWriter("ListaProdutos.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(Dados.produtos);
            fw.flush();
            pw.close();
            fw.close();

        } catch (IOException e){

        }
        return null;
    }
}




