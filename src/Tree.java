public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public Tree(int data) {
        root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        root = Node.insert(root, data);
    }

    public Node search(int data) {
        return Node.search(root, data);
    }

    public static class Node {
        public int data;
        public Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

        private static Node insert(Node node, int data) {
            if (node == null) return new Node(data);
            if (data < node.data) node.left = insert(node.left, data);
            else if (data > node.data) node.right = insert(node.right, data);
            return node;
        }

        private static Node search(Node node, int data) {
            if (node == null || data == node.data) return node;
            if (data < node.data) return search(node.left, data);
            return search(node.right, data);
        }
    }
}
