public class Numero implements Expressao {
    private double valor;

    public Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public double avaliar() {
        return valor;
    }
}
