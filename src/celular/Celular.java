package celular;

public class Celular {
    public static void main(String[] args) {
        Multifuncoes iPhone = new Multifuncoes();


        iPhone.ligar("123456789"); 
        iPhone.atender();
        iPhone.iniciarCorreioVoz();


        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Portugal"); 

        iPhone.exibirPagina("https://github.com"); 
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}