package Computador;

public class HardwareBasico {

    private String nome;
    private float capacidade;

    // sem "public" — só classes do pacote Computador podem instanciar Fortalecendo a composição
    HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }
}
