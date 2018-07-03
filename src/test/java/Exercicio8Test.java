import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercicio8Test {

    @Test
    public void testaIntercalarMesmoTamanho() throws Exception {

        Exercicio8 exercicio8 = new Exercicio8();

        assertEquals(exercicio8.calculaC(123, 456), 142536);
    }

    @Test
    public void testaIntercalarAMaiorB() throws Exception {

        Exercicio8 exercicio8 = new Exercicio8();

        assertEquals(exercicio8.calculaC(120, 34), 13240);
    }

    @Test
    public void testaIntercalarBMaiorA() throws Exception {

        Exercicio8 exercicio8 = new Exercicio8();

        assertEquals(exercicio8.calculaC(12, 340), 13240);
    }

    @Test
    public void testaRetornoMaiorUmMilhao() throws Exception {

        Exercicio8 exercicio8 = new Exercicio8();

        assertEquals(exercicio8.calculaC(123456, 123456), -1);
    }

}