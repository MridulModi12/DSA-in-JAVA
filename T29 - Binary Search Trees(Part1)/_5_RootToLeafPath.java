import java.util.*;
public class _5_RootToLeafPath {
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

    static void rootToLeaf(Node root, ArrayList<Integer> path) {
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null) {
            printPath(path);
        }
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    static void printPath(ArrayList<Integer> path) {
        for(int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;
        for(int i = 0; i < values.length; i++) {
            root = buildBST(root, values[i]);
        }
        inorder(root);
        System.out.println();

        rootToLeaf(root, new ArrayList<>());
    }
}