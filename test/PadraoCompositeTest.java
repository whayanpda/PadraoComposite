import org.junit.Test;
import static org.junit.Assert.*;

public class PadraoCompositeTest {

    @Test
    public void testNumero() {
        Numero numero = new Numero(5);
        assertEquals(5.0, numero.avaliar(), 0.0);
    }

    @Test
    public void testSoma() {
        Expressao esquerda = new Numero(3);
        Expressao direita = new Numero(5);
        Soma soma = new Soma(esquerda, direita);
        assertEquals(8.0, soma.avaliar(), 0.0);
    }

    @Test
    public void testSubtracao() {
        Expressao esquerda = new Numero(10);
        Expressao direita = new Numero(2);
        Subtracao subtracao = new Subtracao(esquerda, direita);
        assertEquals(8.0, subtracao.avaliar(), 0.0);
    }

    @Test
    public void testMultiplicacao() {
        Expressao esquerda = new Numero(3);
        Expressao direita = new Numero(5);
        Multiplicacao multiplicacao = new Multiplicacao(esquerda, direita);
        assertEquals(15.0, multiplicacao.avaliar(), 0.0);
    }

    @Test
    public void testDivisao() {
        Expressao esquerda = new Numero(10);
        Expressao direita = new Numero(2);
        Divisao divisao = new Divisao(esquerda, direita);
        assertEquals(5.0, divisao.avaliar(), 0.0);
    }

    @Test
    public void testExpressaoComplexa() {
        Expressao tres = new Numero(3);
        Expressao cinco = new Numero(5);
        Expressao dez = new Numero(10);
        Expressao dois = new Numero(2);

        Expressao soma = new Soma(tres, cinco);
        Expressao subtracao = new Subtracao(dez, dois);
        Expressao multiplicacao = new Multiplicacao(soma, subtracao);

        assertEquals(64.0, multiplicacao.avaliar(), 0.0);
    }
}
