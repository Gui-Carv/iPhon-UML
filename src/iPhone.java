public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public ReprodutorMusical getReprodutor() {
        return reprodutor;
    }

    public AparelhoTelefonico getTelefone() {
        return telefone;
    }

    public NavegadorInternet getNavegador() {
        return navegador;
    }

    @Override
    public void tocar() {
        // Implementação do método tocar
    }

    @Override
    public void pausar() {
        // Implementação do método pausar
    }

    @Override
    public void selecionarMusica(String musica) {
        // Implementação do método selecionarMusica
    }

    @Override
    public void ligar(String numero) {
        // Implementação do método ligar
    }

    @Override
    public void atender() {
        // Implementação do método atender
    }

    @Override
    public void iniciarCorreioVoz() {
        // Implementação do método iniciarCorreioVoz
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação do método exibirPagina
    }

    @Override
    public void adicionarNovaAba() {
        // Implementação do método adicionarNovaAba
    }

    @Override
    public void atualizarPagina() {
        // Implementação do método atualizarPagina
    }
}
