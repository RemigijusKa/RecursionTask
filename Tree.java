public class Tree {

    private static Node root;

    public Tree() {
    }

    public static void main(String args[]) {

        Tree tree = new Tree();
        tree.root = new Node(null);
        root.setValue("A");

        Node node1 = addChild(root, "B");
        Node node2 = addChild(root, "D");
        Node node3 = addChild(node1, "F");
        Node node4 = addChild(node2, "G");
        Node node5 = addChild(node2, "H");
        Node node6 = addChild(node2, "J");
        Node node7 = addChild(node4, "C");
        Node node8 = addChild(node4, "Z");
        Node node9 = addChild(node5, "W");
        Node node10 = addChild(node6, "Y");
        Node node11 = addChild(node6, "X");
        Node node12 = addChild(node10, "O");

        System.out.println(calculateLevel(root));
    }

    public static Node addChild(Node parent, String value) {
        Node node = new Node(parent);
        node.setValue(value);
        parent.getChildren().add(node);
        return node;
    }

    public static int calculateLevel(Node current) {
        int level = 0;
        if (current == null) {
            return level;
        }
        if (current.getChildren().isEmpty()) {
            return 1;
        }
        for (Node node : current.getChildren()) {
            level = Math.max(level, calculateLevel(node));
        }
        return level + 1;
    }

}
