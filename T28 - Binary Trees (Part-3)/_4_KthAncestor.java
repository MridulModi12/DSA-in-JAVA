public class _4_KthAncestor {
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
    public static int kthAncestor(Node root, int node, int k) {
        if(root == null) {
            return -1;
        }
        if(root.data == node) {
            return 0;
        }
        int ld = kthAncestor(root.left, node, k);
        int rd = kthAncestor(root.right, node, k);
        if(ld == -1 && rd == -1) {
            return -1;
        }
        int max = Math.max(ld, rd) + 1;
        if(max == k) {
            System.out.println(root.data);
        }
        return max;
    }
    public static void main(String[] args) {
        Node root = new Node(1);                             
        root.left = new Node(2);                            
        root.left.left = new Node(4);                       
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        kthAncestor(root, 5, 2);
    }
}