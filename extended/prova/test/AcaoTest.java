import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcaoTest {

    private Desafio d;

    @BeforeEach
    void setUp() {
        this.d = new DesafioSocial("teste 1", 9);
    }

    @Test
    void testAcao1() {
        Acao acao = new Acao("1", "28/04/2024", this.d);
        acao.atualizaProgresso();
        assertEquals(10, acao.getProgresso());
    }

    @Test
    void testAcao2() {
        Acao acao = new Acao("1", "28/04/2024", this.d);
        assertEquals(0, acao.getProgresso());
    }

    @Test
    void testAcao3() {
        Acao acao = new Acao("1", "28/04/2024", this.d);
        acao.atualizaProgresso(30);
        assertEquals(30, acao.getProgresso());
    }

    @Test
    void testAcao4() {
        Acao acao = new Acao("1", "28/04/2024", this.d);
        acao.atualizaProgresso();
        acao.atualizaProgresso(50);
        assertEquals(60, acao.getProgresso());
    }
}
