public class Q3_DeleteLeaf {
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
    public static Node delete(Node root, int x) { //you can see the chatGPT code that is better
        if(root == null) {
            return null;
        }
        Node left = delete(root.left, x);
        Node right = delete(root.right, x);
        if(left == null) {
            root.left = null;     // It changes the object state as left is a part of the object.
        }
        if(right == null) {
            root.right = null;
        }
        if(root.left == null && root.right == null && root.data == x) {
            root = null; // We are removing the root reference from the object and pointing it towards null. Note that the object is not deleted(by garbage collector) as it is still referenced by others. 
        }
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
        root.left = new Node(3);                            
        root.left.left = new Node(3);     
        root.left.left.left = new Node(3);                  
        root.left.right = new Node(2);
        root.right = new Node(3);
        preorder(root);
        System.out.println();
        preorder(delete(root, 3));
    }
}