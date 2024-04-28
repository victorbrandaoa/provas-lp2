import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeuDesafioMinhaVidaTest {

    private MeuDesafioMinhaVida sistema;

    @BeforeEach
    void setUp() {
        this.sistema = new MeuDesafioMinhaVida();
        this.sistema.addDesafioPessoal("Meu desafio default");
    }

    @Test
    void addDesafioTest() {
        assertEquals(2, this.sistema.addDesafioPessoal("Meu primeiro desafio"));
    }

    @Test
    void addDesafioExistenteTest() {
        assertEquals(-1, this.sistema.addDesafioPessoal("Meu desafio default"));
    }


    @Test
    void exibeDesafioTest() {
        assertEquals("Título: Meu desafio default (pessoal)\n0 execuções", this.sistema.exibirDesafio(1));
    }
}
