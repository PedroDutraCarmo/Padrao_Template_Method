package padroescomportamentais.templatemethod.banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteComumTest {

    @Test
    void deveRetornarLiberado() {
        ClienteComum cliente = new ClienteComum();
        cliente.setScore1(6.0f);
        cliente.setScore2(6.0f);
        assertEquals("Liberado", cliente.verificarLiberacao());
    }

    @Test
    void deveRetornarNegado() {
        ClienteComum cliente = new ClienteComum();
        cliente.setScore1(6.0f);
        cliente.setScore2(5.9f);
        assertEquals("Negado", cliente.verificarLiberacao());
    }

    @Test
    void deveRetornarInformacoes() {
        ClienteComum cliente = new ClienteComum();
        cliente.setScore1(6.0f);
        cliente.setScore2(5.9f);
        cliente.setNome("Marcelo");
        cliente.setId(2);
        assertEquals("Cliente{id=2, nome='Marcelo', resultado=Negado}", cliente.getInfo());
    }
}