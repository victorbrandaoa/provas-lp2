public class DesafioSocial extends Desafio {
    private int numeroPessoasAfetadas;

    public DesafioSocial(String titulo, String descricao, int numeroPessoasAfetadas) {
        super(titulo, descricao, "social");
        this.numeroPessoasAfetadas = numeroPessoasAfetadas;
    }

    public DesafioSocial(String titulo, int numeroPessoasAfetadas) {
        super(titulo, "social");
        this.numeroPessoasAfetadas = numeroPessoasAfetadas;
    }

    @Override
    public int calculaSatisfacao() {
        if (this.numeroPessoasAfetadas >= 10 && this.numeroPessoasAfetadas <= 50) {
            return 20;
        } else if (this.numeroPessoasAfetadas >= 51 && this.numeroPessoasAfetadas <= 100) {
            return 50;
        } else if (this.numeroPessoasAfetadas > 100) {
            return numeroPessoasAfetadas;
        }
        return 0;
    }
}
