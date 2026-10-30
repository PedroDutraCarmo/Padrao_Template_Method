package padroescomportamentais.templatemethod.banco;

public class ClienteComum extends Cliente {

    public String verificarLiberacao() {
        if (this.calcularScoreFinal() >= 6.0f) {
            return "Liberado";
        }
        else {
            return "Negado";
        }
    }
}