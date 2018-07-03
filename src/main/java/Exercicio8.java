/**
 * Classe responsável por realizar operações pertinentes ao exercício 8 do teste da S2IT.
 *
 * @author Maico Rodrigo Caumo
 * @since 02/07/2018
 */
public class Exercicio8 {

    /**
     * Metodo que recebe dois números inteiros e os intercala.
     *
     * @param a mumero inteiro
     * @param b mumero inteiro
     * @return Caso o retorno seja maior que 1.000.000, retorna -1, caso contrario retorna os números intercalados.
     */
    public int calculaC(int a, int b) {

        String[] valorA = String.valueOf(a).split("");
        String[] valorB = String.valueOf(b).split("");
        String restante = "";

        if (valorA.length != valorB.length) {
            if (valorA.length > valorB.length) {
                restante = String.valueOf(a).substring(valorB.length, valorA.length);
                valorA = String.valueOf(a).substring(0, valorB.length).split("");
            } else {
                restante = String.valueOf(b).substring(valorA.length, valorB.length);
                valorB = String.valueOf(b).substring(0, valorA.length).split("");
            }
        }

        String valorC = intercalaInteiros(valorA, valorB, restante);

        return Long.valueOf(valorC) > 1000000 ? -1 : Integer.valueOf(valorC);
    }

    private String intercalaInteiros(String[] valorA, String[] valorB, String restante) {

        String retorno = "";

        for (int i = 0; i < valorA.length; i++) {
            retorno += valorA[i] + valorB[i];
        }

        return retorno + restante;
    }
}
