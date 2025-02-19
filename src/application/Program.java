package application;

import model.entities.IPhone;

public class Program {
    public static void main(String[] args) {
        IPhone iPhone14 = new IPhone();
        iPhone14.ligar("1234567890");
        iPhone14.exibirPagina("google.com");
        iPhone14.selecionarMusica("Duran Duran - Invisible");
    }
}
