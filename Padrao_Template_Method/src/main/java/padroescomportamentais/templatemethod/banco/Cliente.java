package padroescomportamentais.templatemethod.banco;

public abstract class Cliente {

    private int id;
    protected String nome;
    private float score1; // Substitui nota1
    private float score2; // Substitui nota2

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getScore1() {
        return score1;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    public float calcularScoreFinal() {
        return (this.score1 + this.score2) / 2;
    }

    // O método Abstrato (A lacuna do Template)
    public abstract String verificarLiberacao();

    public String getTipo() {
        return "Cliente";
    }

    // O TEMPLATE METHOD (O método pronto que usa a lacuna)
    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", resultado=" + this.verificarLiberacao() +
                '}';
    }
}