public class Usuario {
public static void main(String[] args) {
    IPhone celular = new IPhone();

    celular.selecionarMusica("KOMM, SUSSER TOD");
    celular.tocar();
    celular.pausar();
    System.out.println("---------------------");
    celular.exibirPagina("google.com");
    celular.adicionarNovaAba();
    celular.atualizarPagina();
    System.out.println("---------------------");
    celular.ligar("0090900909099");
    celular.atender();
    celular.iniciarCorreioVoz();
}
}
