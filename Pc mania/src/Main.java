import java.util.Scanner;
import Cliente.Cliente;
import Computador.Computador;
import Computador.MemoriaUSB;

public class Main {

    public static void main(String[] args) {

        //Criando o cadastro do cliente
        Cliente cliente = new Cliente("Flavin from the tire", "123.456.789-67");


        // Montando os computadores

        Computador computador1 = new Computador(
                "Apple", 668, "MacOS Sequoia", 64,
                new String[]{"Pentium Core i5", "Memoria RAM", "HD"},
                new float[]{2200,8,500}
        );

        Computador computador2 = new Computador(
                "Samsung", 669, "Windows 8", 64,
                new String[]{"Pentium Core i7", "Memória RAM", "HD"},
                new float[]{3370, 16, 1000}
        );

        Computador computador3 = new Computador(
                "Dell", 670, "Windows 10", 64,
                new String[]{"Pentium Core i7", "Memória RAM", "HD"},
                new float[]{4500, 32, 2000}
        );

        //Criando as Memorias USBs

        MemoriaUSB memoria1 = new MemoriaUSB("Pen drive", 16);
        MemoriaUSB memoria2 = new MemoriaUSB("Pen drive", 32);
        MemoriaUSB memoria3 = new MemoriaUSB("HD Externo", 1000);

        Computador[] catalogo = {computador1, computador2, computador3};
        MemoriaUSB[] memorias = {memoria1, memoria2, memoria3};
        cliente.menu(catalogo, memorias);


    }
}
