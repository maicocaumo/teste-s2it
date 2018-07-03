/**
 * Classe responsável por realizar operações pertinentes ao exercício 9 do teste da S2IT.
 *
 * @author Maico Rodrigo Caumo
 * @since 02/07/2018
 */
public class BinaryTree {

    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    /**
     * Instancia um objeto {@link BinaryTree} com um valor.
     * @param valor
     */
    public BinaryTree(int valor) {
        this.valor = valor;
    }

    /**
     * Executa a soma da árvore
     * @return soma de todos os nós subsequentes
     */
    public int soma() {

        return soma(this);
    }

    private int soma(BinaryTree binaryTree) {

        if (binaryTree == null)
            return 0;

        int valueLeft = soma(binaryTree.getLeft());
        int valueRight = soma(binaryTree.getRight());

        return binaryTree.getValor() + valueLeft + valueRight;
    }

    /**
     * Insere um novo item filho na árvore, com base no valor determina em qual lado deve inserir.
     * @param item Filho
     */
    public void inserir(BinaryTree item) {

        int valorAtual = this.getValor();

        if (item.getValor() < valorAtual) {

            if (this.left == null) {
                this.left = item;
            } else {
                this.left.inserir(item);
            }

        } else {

            if (this.right == null) {
                this.right = item;
            } else {
                this.right.inserir(item);
            }
        }
    }

    public int getValor() {
        return valor;
    }

    public BinaryTree getLeft() {
        return left;
    }

    public BinaryTree getRight() {
        return right;
    }
}
