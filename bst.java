public class BST {
    private Node root;

    
    public BST() {
        root = null;
    }

   
    private class Node {
        int data;
        Node left, right;

        public Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    
    public void addNode(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value < current.data) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }

   
    private void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data + " ");
        inOrderTraversal(node.right);
    }

    
    public void printInOrder() {
        inOrderTraversal(root);
        System.out.println();
    }
}
public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.addNode(5);
        tree.addNode(3);
        tree.addNode(7);
        tree.addNode(1);
        tree.addNode(9);
        tree.printInOrder(); 
}