public class Q2_InvertBinaryTree {
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
    public static Node invert(Node root) {  // you dont need to return the root, you can make the return type of the fn void, and shift lines 16 & 17 to 21
        if(root == null) {
            return null;
        }
        invert(root.left);
        invert(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
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
        preorder(invert(root));
    }
}