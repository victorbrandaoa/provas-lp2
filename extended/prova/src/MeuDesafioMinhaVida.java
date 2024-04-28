import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MeuDesafioMinhaVida {

    private List<Desafio> desafios;

    private Map<String,Acao> acoes;

    public MeuDesafioMinhaVida() {
        this.desafios = new ArrayList<>();
        this.acoes = new HashMap<>();
    }

    public int addDesafioPessoal(String titulo, String descricao) {
        Desafio desafio = new DesafioPessoal(titulo, descricao);
        this.desafios.add(desafio);
        return this.desafios.size();
    }

    public int addDesafioPessoal(String titulo) {
        Desafio desafio = new DesafioPessoal(titulo);
        this.desafios.add(desafio);
        return this.desafios.size();
    }

    public int addDesafioMaterial(String titulo, String descricao, double investimento) {
        Desafio desafio = new DesafioMaterial(titulo, descricao, investimento);
        this.desafios.add(desafio);
        return this.desafios.size();
    }

    public int addDesafioMaterial(String titulo, double investimento) {
        Desafio desafio = new DesafioMaterial(titulo, investimento);
        this.desafios.add(desafio);
        return this.desafios.size();
    }

    public int addDesafioSocial(String titulo, String descricao, int numeroPessoasAfetadas) {
        Desafio desafio = new DesafioSocial(titulo, descricao, numeroPessoasAfetadas);
        this.desafios.add(desafio);
        return this.desafios.size();
    }

    public int addDesafioSocial(String titulo, int numeroPessoasAfetadas) {
        Desafio desafio = new DesafioSocial(titulo, numeroPessoasAfetadas);
        this.desafios.add(desafio);
        return this.desafios.size();
    }

    public String exibirDesafio(int idDesafio) {
        return this.desafios.get(idDesafio-1).toString();
    }

    public void addAcao(int idDesafio, String dataInicio, String codigo) {
        Acao acao = new Acao(codigo, dataInicio, this.desafios.get(idDesafio-1));
        this.acoes.put(codigo, acao);
    }

    public void atualizaProgressoAcao(String codigo) {
        this.acoes.get(codigo).atualizaProgresso();
    }

    public void atualizaProgressoAcao(String codigo, int progresso) {
        this.acoes.get(codigo).atualizaProgresso(progresso);
    }

    public String[] listarAcaoPorOrdemProgresso() {
        List<Acao> listaAcoes = new ArrayList<>(this.acoes.values());
        listaAcoes.sort(
                (o1, o2) -> o1.getProgresso() - o2.getProgresso()
        );

        return listaAcoes.stream()
                                .map(Acao::toString)
                                .toArray(String[]::new);
    }
}
