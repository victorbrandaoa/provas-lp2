public class Acao {

    private String codigo;

    private String dataInicio;

    private int progresso;

    private Desafio desafio;

    public Acao(String codigo, String dataInicio, Desafio desafio) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.progresso = 0;
        this.desafio = desafio;
    }

    private void finalizaDesafio() {
        if (this.progresso == 100) {
            this.desafio.atualizaExecucoes();
        }
    }

    public void atualizaProgresso(int progresso) {
        if (this.progresso < 100) {
            this.progresso += progresso;
            this.finalizaDesafio();
        }
    }

    public void atualizaProgresso() {
        if (this.progresso < 100) {
            this.progresso += 10;
            this.finalizaDesafio();
        }
    }

    public int getProgresso() {
        return progresso;
    }

    @Override
    public String toString() {
        return String.format("Acao %s - %s - %s - Progresso %d", this.codigo, this.dataInicio, this.desafio.getTitulo(), this.progresso);
    }
}
