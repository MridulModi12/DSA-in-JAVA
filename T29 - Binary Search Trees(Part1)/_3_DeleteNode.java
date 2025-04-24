public class _3_DeleteNode {
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

    static Node findInorderSuccessor(Node root) {   //Can also be done iteratively by doing root = root.left till root.left != null
        if(root.left == null) {
            return root;
        }
        return findInorderSuccessor(root.left);
    }

    static Node delete(Node root, int data) {
        if(data < root.data) {
            root.left = delete(root.left, data);
        }
        else if(data > root.data) {
            root.right = delete(root.right, data);
        }
        else {   //found the node to be deleted
            //case 1
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            //case 3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        inorder(root);
        System.out.println();
        
        root = delete(root, 11);
        inorder(root);
    }
}