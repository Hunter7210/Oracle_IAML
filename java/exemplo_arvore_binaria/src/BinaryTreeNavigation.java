public class BinaryTreeNavigation {
    Node node;

    // Método de travessia em pré-ordem

    void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.name + " "); // Visitar o nó atual.
            preOrderTraversal(node.left);// Percorrer a subárvore esquerda.
            preOrderTraversal(node.right); // Percorrer a subárvore direita.
        }
    }

    // Método de travessia em pós-ordem
    void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left); //Percorrer a subárvore esquerda.
            postOrderTraversal(node.right); //Percorrer a subárvore direita.
            System.out.print(node.name + " "); //Visitar o nó atual.
        }
    }

    // Método de travessia em ordem (in-order)
    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left); //Percorrer a subárvore esquerda.
            System.out.print(node.name + " ");//Visitar o nó atual
            inOrderTraversal(node.right); //Percorrer a subárvore direita.
        }
    }
}
