public class BinaryTree {

    private static Node root;

    public BinaryTree(int data) {

        root = new Node(data);
    }

    public BinaryTree() {
    }

    public static void main(String args[]) {

        BinaryTree tree = new BinaryTree(6);
        tree.add(4);
        tree.add(9);
        tree.add(7);
        tree.add(11);
        tree.add(3);
        tree.add(10);
        tree.add(15);
        tree.add(8);
        tree.add(20);

        int treeHeight = calculateDeepestLevel(root);
        System.out.println(treeHeight);
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.getValue()) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        } else {

            return current;
        }

        return current;
    }

    public static int calculateDeepestLevel(Node node) {

        if (node == null) {
            return 0;
        } else {
            return 1 + Math.max(calculateDeepestLevel(node.getLeft()),
                    calculateDeepestLevel(node.getRight()));
        }
    }
}
