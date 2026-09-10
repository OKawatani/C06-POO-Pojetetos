package Computador;

public class Computador {


    //Atributos
    private String marca;
    private float preco;

    //Agregação
    private MemoriaUSB memoriaUSB;

    //Composições
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwareBasicos;


    //Construtor
    public Computador(String marca, float preco, String nomeSO, int tipoSO, String nomesHB[], float capacidadesHB[]) {
        this.marca = marca;
        this.preco = preco;

        //Composição do Sistema Operacional
        this.sistemaOperacional = new SistemaOperacional(nomeSO, tipoSO);

        //Composição do Hardware basico
        this.hardwareBasicos = new HardwareBasico[nomesHB.length];
        for (int i = 0; i < nomesHB.length; i++){
            this.hardwareBasicos[i] = new HardwareBasico(nomesHB[i], capacidadesHB[i]);
        }
    }


    public void mostraPCConfigs(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preco R$: " + this.preco);

        System.out.println("Sistema operacional: " + sistemaOperacional.getNome() + " " + sistemaOperacional.getTipo() + "bits");

        System.out.println("Processador: " + this.hardwareBasicos[0].getNome() + " " + this.hardwareBasicos[0].getCapacidade() + " Mhz");
        System.out.println("Memoria: " + this.hardwareBasicos[1].getNome() +  " " + this.hardwareBasicos[1].getCapacidade() + " Gb ");

        System.out.println("Armazenamento: " + this.hardwareBasicos[2].getNome() + " " + this.hardwareBasicos[2].getCapacidade() + " Gb");


        System.out.println("(ADICIONAL) Memoria USB");
        if (this.memoriaUSB == null) {
            System.out.println("Nenhuma memoria USB conectada");
            System.out.println(" ");
        } else {
            System.out.println("- " + memoriaUSB.getNome() + " " + memoriaUSB.getCapacidade() + " Gb");
            System.out.println(" ");
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb){
        if (this.memoriaUSB == null) {
            this.memoriaUSB = musb;
        } else {
            System.out.println("Este computador ja possui uma memoria USB conectada!");
        }
    }

    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }
}
