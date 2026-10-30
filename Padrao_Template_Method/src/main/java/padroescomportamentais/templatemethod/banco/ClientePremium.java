package padroescomportamentais.templatemethod.banco;

public class ClientePremium extends Cliente {

    public String verificarLiberacao() {
        if (this.calcularScoreFinal() >= 7.0f) {
            return "Liberado";
        }
        else {
            return "Negado";
        }
    }

    @Override
    public String getTipo() {
        return "ClienteVIP";
    }
}