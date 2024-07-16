public class Multiplicacao implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public Multiplicacao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public double avaliar() {
        return esquerda.avaliar() * direita.avaliar();
    }
}
