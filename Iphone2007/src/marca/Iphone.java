package marca;

import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;
import funcionalidades.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecioando musica " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correi de voz");
    }
}
