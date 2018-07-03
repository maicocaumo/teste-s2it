import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    @Test
    public void testaArvoreSimples() throws Exception {

        BinaryTree binaryTree = new BinaryTree(10);

        binaryTree.inserir(new BinaryTree(5));
        binaryTree.inserir(new BinaryTree(15));

        assertEquals(binaryTree.soma(), 30);
    }

    @Test
    public void testaArvoreComFilhos() throws Exception {

        BinaryTree binaryTree = new BinaryTree(20);
        BinaryTree binaryTree1 = new BinaryTree(10);
        BinaryTree binaryTree2 = new BinaryTree(10);

        binaryTree.inserir(binaryTree1);
        binaryTree.inserir(binaryTree2);

        assertEquals(binaryTree.soma(), 40);
    }

    @Test
    public void testaArvoreComFilhosESubFilhos() throws Exception {

        BinaryTree binaryTree = new BinaryTree(20);
        BinaryTree binaryTree1 = new BinaryTree(10);
        BinaryTree binaryTree2 = new BinaryTree(10);

        binaryTree1.inserir(new BinaryTree(50));
        binaryTree1.inserir(new BinaryTree(50));

        binaryTree2.inserir(new BinaryTree(50));
        binaryTree2.inserir(new BinaryTree(50));

        binaryTree.inserir(binaryTree1);
        binaryTree.inserir(binaryTree2);

        assertEquals(binaryTree.soma(), 240);
    }

}