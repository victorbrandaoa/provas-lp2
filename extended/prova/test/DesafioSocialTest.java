import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DesafioSocialTest {

    @Test
    void testDesafioSocial1() {
        Desafio d = new DesafioSocial("teste 1", 9);
        assertEquals(0, d.calculaSatisfacao());
    }

    @Test
    void testDesafioSocial2() {
        Desafio d = new DesafioSocial("teste 1", 10);
        assertEquals(20, d.calculaSatisfacao());
    }

    @Test
    void testDesafioSocial3() {
        Desafio d = new DesafioSocial("teste 1", 50);
        assertEquals(20, d.calculaSatisfacao());
    }

    @Test
    void testDesafioSocial4() {
        Desafio d = new DesafioSocial("teste 1", 51);
        assertEquals(50, d.calculaSatisfacao());
    }

    @Test
    void testDesafioSocial5() {
        Desafio d = new DesafioSocial("teste 1", 100);
        assertEquals(50, d.calculaSatisfacao());
    }

    @Test
    void testDesafioSocial6() {
        Desafio d = new DesafioSocial("teste 1", 101);
        assertEquals(101, d.calculaSatisfacao());
    }


}
