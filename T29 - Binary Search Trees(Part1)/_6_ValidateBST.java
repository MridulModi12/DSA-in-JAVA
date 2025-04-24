public class _6_ValidateBST {
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
    static boolean isValidBST(Node root, Node max, Node min) {
        if(root == null) {
            return true;
        }
        if(min != null && root.data <= min.data) {
            return false;
        }
        if(max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, root, min)    //agar left wala false hua toh right wala check nhi hoga
            && isValidBST(root.right, max, root);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }    
}