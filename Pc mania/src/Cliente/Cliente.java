package Cliente;
import Computador.Computador;
import Computador.MemoriaUSB;

import java.util.Scanner;

public class Cliente {


    private String nome;
    private String cpf;
    private Computador[] pcsComprados;
    private int qtdComprados;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pcsComprados = new Computador[10];
        this.qtdComprados = 0;

    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdComprados; i++) {
            total += pcsComprados[i].getPreco();
        }
        return total;
    }


    public void menu(Computador[] catalogo, MemoriaUSB[] memorias) {

        Scanner input = new Scanner(System.in);
        int opcao;

        System.out.println("Bem vindo ao PC Mania!");

        do {
            System.out.println("\nPcMania");
            System.out.println("1- Realizar compras ");
            System.out.println("2- Adicionar Memoria RAM ");
            System.out.println("0- Sair");

            opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Qual promoção você deseja?");
                    for (int i = 0; i < catalogo.length; i++) {
                        System.out.println("-Promoção " + (i + 1));
                        catalogo[i].mostraPCConfigs();
                        System.out.println(" ");
                    }

                    int compra = input.nextInt();

                    if (compra >= 1 && compra <= catalogo.length && qtdComprados < pcsComprados.length) {

                        pcsComprados[qtdComprados] = catalogo[compra - 1];
                        qtdComprados++;
                        System.out.println("Produto adicionado ao carrinho");

                    } else {
                        System.out.println("Opção de compra inválida");
                    }
                    break;

                case 2:
                    System.out.println("Memorias USBs disponiveis:");
                    for (int i = 0; i < memorias.length; i++) {
                        System.out.println((i + 1) + "- " + memorias[i].getNome() + " " + memorias[i].getCapacidade()
                                + " Gb (vai para o computador " + catalogo[i].getMarca() + ")");
                    }

                    int escolhaMemoria = input.nextInt();

                    if (escolhaMemoria >= 1 && escolhaMemoria <= memorias.length) {
                        catalogo[escolhaMemoria - 1].addMemoriaUSB(memorias[escolhaMemoria - 1]);
                        System.out.println("Memoria USB adicionada ao computador " + catalogo[escolhaMemoria - 1].getMarca());
                    } else {
                        System.out.println("Opção de memória inválida");
                    }
                    break;

                case 0:
                    System.out.println("Dados do cliente: " + this.nome);
                    System.out.println("Cpf: " + this.cpf);

                    System.out.println("PCs adquiridos:");
                    for (int i = 0; i < qtdComprados; i++) {
                        System.out.println("- " + pcsComprados[i].getMarca());
                    }

                    System.out.println("Valor total dos itens R$: " + this.calculaTotalCompra());
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        } while (opcao != 0);
    }
}





