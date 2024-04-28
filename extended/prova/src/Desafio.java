public abstract class Desafio {

    protected String titulo;

    protected String descricao;

    protected int execuxoes;

    protected String tipo;

    public Desafio(String titulo, String descricao, String tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.execuxoes = 0;
    }

    public Desafio(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.descricao = "";
        this.execuxoes = 0;
    }

    abstract public int calculaSatisfacao();

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return String.format("Título: %s (%s)\n%d execuções", this.titulo, this.tipo, this.execuxoes);
    }

    public void atualizaExecucoes() {
        this.execuxoes += 1;
    }
}
