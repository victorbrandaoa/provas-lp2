public class DesafioMaterial extends Desafio {
    private double investimento;

    public DesafioMaterial(String titulo, String descricao, double investimento) {
        super(titulo, descricao, "material");
        this.investimento = investimento;
    }

    public DesafioMaterial(String titulo, double investimento) {
        super(titulo, "material");
        this.investimento = investimento;
    }

    @Override
    public int calculaSatisfacao() {
        return ((int) this.investimento / 100) * 10;
    }
}
