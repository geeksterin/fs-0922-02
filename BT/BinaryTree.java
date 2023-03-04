class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {
    Node root;
}