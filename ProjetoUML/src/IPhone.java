public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusica {

    @Override
    public void tocar() {
        System.out.println("playing");
    }

    @Override
    public void pausar() {
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("tocando "+musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("abrindo a página "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
