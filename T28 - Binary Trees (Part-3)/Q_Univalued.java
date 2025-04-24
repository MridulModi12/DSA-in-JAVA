public class Q_Univalued {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean univalued(Node root, int node) {
        if(root == null) {
            return true;
        }
        if(root.data != node) {
            return false;
        }
        return univalued(root.left, node) && univalued(root.right, node);
    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(2);
        root.right = new Node(2);
        System.out.println(univalued(root, root.data));
    }
}