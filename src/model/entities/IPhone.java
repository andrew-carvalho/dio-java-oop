package model.entities;

import model.interfaces.NavegadorInternet;
import model.interfaces.ReprodutorMusical;

public class IPhone extends AparelhoTelefonico implements ReprodutorMusical, NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}
