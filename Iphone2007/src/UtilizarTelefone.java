import marca.Iphone;

public class UtilizarTelefone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Bone");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(99) 99999-9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("teste.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
