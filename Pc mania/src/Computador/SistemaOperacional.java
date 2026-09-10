package Computador;

public class SistemaOperacional {

    private String nome;
    private int tipo;


    // sem "public" — só classes do pacote Computador podem instanciar Fortalecendo a composição
    SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
