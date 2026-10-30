package padroescomportamentais.templatemethod.banco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientePremiumTest {

    @Test
    void deveRetornarLiberado() {
        ClientePremium cliente = new ClientePremium();
        cliente.setScore1(7.0f);
        cliente.setScore2(7.0f);
        assertEquals("Liberado", cliente.verificarLiberacao());
    }

    @Test
    void deveRetornarNegado() {
        ClientePremium cliente = new ClientePremium();
        cliente.setScore1(7.0f);
        cliente.setScore2(6.9f);
        assertEquals("Negado", cliente.verificarLiberacao());
    }

    @Test
    void deveRetornarInformacoes() {
        ClientePremium cliente = new ClientePremium();
        cliente.setScore1(7.0f);
        cliente.setScore2(7.0f);
        cliente.setNome("Marco");
        cliente.setId(1);
        assertEquals("ClienteVIP{id=1, nome='Marco', resultado=Liberado}", cliente.getInfo());
    }
}