public class _2_SearchBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node buildBST(Node root, int data) {
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(data < root.data) {
            root.left = buildBST(root.left, data);
        } else {
            root.right = buildBST(root.right, data);
        }
        return root;
    }
    static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }
        if(root.data == key) {
            return true;
        }
        if(key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int values[] = {5, 1, 3, 4, 2, 7};
        for(int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        if(search(root, 10)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}