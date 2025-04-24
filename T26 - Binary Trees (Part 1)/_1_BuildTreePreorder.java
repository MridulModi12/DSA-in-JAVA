import java.util.*;
public class _1_BuildTreePreorder {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;
        public Node buildTreePreorder(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            Node newNode  = new Node(nodes[idx]);
            newNode.left = buildTreePreorder(nodes);
            newNode.right = buildTreePreorder(nodes);
            return newNode;
        }
        public void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public void postorder(Node root) {
            if(root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    }
                    q.add(null);
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null)
                        q.add(currNode.left);
                    if(currNode.right != null)
                        q.add(currNode.right);
                }
            }
        }
        public int height(Node root) {
            if(root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
        public int countOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int lc = countOfNodes(root.left);
            int rc = countOfNodes(root.right);
            return lc+rc+1;
        }
        public int sumOfNodes(Node root) {
            if(root == null) {
                return 0;
            }
            int ls = sumOfNodes(root.left);
            int rs = sumOfNodes(root.right);
            return ls + rs + root.data;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        //int nodes[] = {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTreePreorder(nodes);
        System.out.println("Root = " + root.data);
        System.out.print("Preorder = ");
        tree.preorder(root);
        System.out.print("\nInorder = ");
        tree.inorder(root);
        System.out.print("\nPostorder = ");
        tree.postorder(root);
        System.out.println("\nLevel Order :- ");
        tree.levelOrder(root);
        System.out.println("Height = " + tree.height(root));
        System.out.println("No. of nodes = " + tree.countOfNodes(root));
        System.out.println("Sum of nodes = " + tree.sumOfNodes(root));
    }             
}