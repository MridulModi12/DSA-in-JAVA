import java.util.*;
public class _1_KthLevel {
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
    public static void kthLevel_Iterative(Node root, int k) {
        int level = 1;
        Queue<Node> q = new LinkedList<>();
        if(level == k) {
            System.out.print(root.data);
            return;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                level++;
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(level == k) {
                    System.out.print(currNode.data  +" ");
                }
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        System.out.println();
    }
    public static void kthLevel_Recursive(Node root, int k, int level) {
        if(root == null) {
            return;
        }
        if(level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel_Recursive(root.left, k, level+1);
        kthLevel_Recursive(root.right, k, level+1);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        kthLevel_Iterative(root, 3);
        kthLevel_Recursive(root, 3, 1);
    }
}