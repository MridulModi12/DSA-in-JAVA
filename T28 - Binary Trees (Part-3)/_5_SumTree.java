public class _5_SumTree {
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
    public static int sumTree(Node root) {
        if(root == null) {
            return 0;
        }
        int leftChild = sumTree(root.left);
        int rightChild = sumTree(root.right);
        int data = root.data;
        int left = root.left == null ? 0 : root.left.data;
        int right = root.right == null ? 0 : root.right.data;
        root.data =  left + right + leftChild + rightChild;
        return data;
    }
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);                             
        root.left = new Node(2);                            
        root.left.left = new Node(4);                       
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        sumTree(root);
        preorder(root);
    }
}