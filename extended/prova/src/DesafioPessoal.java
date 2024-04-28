public class DesafioPessoal extends Desafio {
    public DesafioPessoal(String titulo, String descricao) {
        super(titulo, descricao, "pessoal");
    }

    public DesafioPessoal(String titulo) {
        super(titulo, "pessoal");
    }

    @Override
    public int calculaSatisfacao() {
        return this.execuxoes * 10;
    }
}
