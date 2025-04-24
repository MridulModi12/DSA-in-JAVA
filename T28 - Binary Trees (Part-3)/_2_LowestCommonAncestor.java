import java.util.*;
public class _2_LowestCommonAncestor {
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
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if(root == null) {
            return false;
        }
        path.add(root);
        if(root.data == n) {
            return true;
        }
        if(getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i;
        for(i = 0; i <= path1.size() && i <= path2.size(); i++) {
            if(path1.get(i) != path2.get(i)) {
                break;
            }
        }
        return path1.get(i-1);
    }
    public static Node lca2(Node root, int n1, int n2) {
        if(root == null) {
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);
        //leftLca = null ; rightLca = val
        if(leftLca == null) {
            return rightLca;
        }
        //leftLca = val ; rightLca = null
        if(rightLca == null) {
            return leftLca;
        }
        return root;  //leftLca  != null && rightLca != null
    }
    public static void main(String[] args) {
        Node root = new Node(1);                             
        root.left = new Node(2);                            
        root.left.left = new Node(4);                       
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        System.out.println(lca(root, 2, 6).data);
        System.out.println(lca2(root, 6, 3).data);
    }
}