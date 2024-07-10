package Tree;

public class TreeIntro {
    public static void main(String[] args) {
        // Tree:
        // non linear data structure for hierarchical storage

        // Terminology:
        // Parent Node: predecessor of a node
        // Child Node: successor of a node
        // Root Node: the topmost node
        // Lead Node: Nodes with no children
        // Sibling; children nodes of the same parent node
        // Level of Node: count of edges from root to specific node
        // Subtree: node of the tree with its descendants
        Node root = new Node(5);
        Node n1 = new Node(6);
        Node n2 = new Node(7);
        Node n3 = new Node(8);
        Node n4 = new Node(9);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n2.right = n4;
    }
}
