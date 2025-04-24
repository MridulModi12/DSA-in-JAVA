public class _3_MinimumDistance {
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
    public static Node lca(Node root, int n1, int n2) {
        if(root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);
        if(leftLca == null) {
            return rightLca;
        }
        if(rightLca == null) {
            return leftLca;
        }
        return root;
    }
    public static int distance(Node node, int n) {
        if(node == null) {
            return -1;
        }
        if(node.data == n) {
            return 0;
        }
        int ld = distance(node.left, n);
        int rd = distance(node.right, n);
        if(ld == -1 && rd == -1) {
            return -1;
        }
        return Math.max(ld, rd) + 1;
    }
    public static int minimumDistance(Node root,  int n1, int n2) {
        Node lca = lca(root, n1, n2);
        int left = distance(lca, n1);
        int right = distance(lca, n2);
        return left + right;
    }
    public static void main(String[] args) {
        Node root = new Node(1);                             
        root.left = new Node(2);                            
        root.left.left = new Node(4);                       
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(minimumDistance(root, 5, 4));
    }
}