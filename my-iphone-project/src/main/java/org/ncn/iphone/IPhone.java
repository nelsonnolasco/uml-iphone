package org.ncn.iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String serialNumber;
    private String model;

    public IPhone(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    // Métodos do Reprodutor Musical
    @Override
    public void play() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void next() {
        System.out.println("Próxima faixa.");
    }

    @Override
    public void previous() {
        System.out.println("Faixa anterior.");
    }

    // Métodos do Aparelho Telefônico
    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    // Métodos do Navegador de Internet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void abrirNovaAba() {
        System.out.println("Abrindo nova aba.");
    }

    @Override
    public void recarregarPagina() {
        System.out.println("Recarregando página.");
    }
}