public class _7_MirrorBST {
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

    static Node mirrorBST(Node root) {
        if(root == null) {
            return null;
        }
        Node ls = mirrorBST(root.left);
        Node rs = mirrorBST(root.right);
        root.left = rs;
        root.right = ls;
        return root;
    } 

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        inorder(root);
        System.out.println();

        root = mirrorBST(root);
        inorder(root);
    }
}