package celular;

public class Multifuncoes implements Internet, Musica, Funcoescelular {
    // Métodos relacionados às funções do celular
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica + "...");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url + "...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba no navegador...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página atual...");
    }
}
