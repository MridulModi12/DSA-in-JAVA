import java.util.*;
public class _1_Diameter {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info {
        int diam;
        int ht;
        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }
    static class Info2 {
        int hd;
        Node node;
        public Info2(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }
    static class BinaryTree {
        public int height(Node root) {
            if(root == null) {
                return 0;
            }
            return Math.max(height(root.left), height(root.right)) + 1;
        }
        public int diameter(Node root) {
            if(root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int selfDiam = lh+rh+1;
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            return Math.max(selfDiam, Math.max(ld, rd));
        }
        public Info diameterOptimized(Node root) {
            if(root == null) {
                return new Info(0, 0);
            }
            Info ld = diameterOptimized(root.left);
            Info rd = diameterOptimized(root.right);
            int selfDiam = ld.ht + rd.ht + 1;
            return new Info(Math.max(selfDiam, Math.max(ld.diam, rd.diam)), Math.max(ld.ht, rd.ht) + 1);
        }
        public boolean isSubtree(Node root, Node subroot) {
            if(root == null) {
                return false;
            }
            if(root.data == subroot.data) {
                return isIdentical(root, subroot);
            }
            return isSubtree(root.left, subroot) || isIdentical(root.right, subroot);
        }
        public boolean isIdentical(Node node, Node subroot) {
            if(node == null && subroot == null) {
                return true;
            }
            if(node == null || subroot == null || node.data != subroot.data) {
                return false;
            }
            if(!isIdentical(node.left, subroot.left)) {
                return false;
            }
            if(!isIdentical(node.right, subroot.right)) {
                return false;
            }
            return true;
        }
        public void topView(Node root) {
            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<Info2> q = new LinkedList<>();
            int max = 0, min = 0;
            q.add(new Info2(0, root));
            while(!q.isEmpty()) {
                Info2 curr = q.remove();
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node.data);
                    min = Math.min(min, curr.hd);
                    max = Math.max(max, curr.hd);
                }
                if(curr.node.left != null) {
                    q.add(new Info2(curr.hd-1, curr.node.left));
                }
                if(curr.node.right != null) {
                    q.add(new Info2(curr.hd+1, curr.node.right));
                }
            }
            for(int i = min; i <= max; i++) {
                System.out.print(map.get(i) + " ");
            }
            System.out.println();
        }
        public void BottomView(Node root) {
            HashMap<Integer, Integer> map = new HashMap<>();
            Queue<Info2> q = new LinkedList<>();
            int max = 0, min = 0;
            q.add(new Info2(0, root));
            while(!q.isEmpty()) {
                Info2 curr = q.remove();
                map.put(curr.hd, curr.node.data);
                max = Math.max(max, curr.hd);
                min = Math.min(min, curr.hd);
                if(curr.node.left != null) {
                    q.add(new Info2(curr.hd-1, curr.node.left));
                }
                if(curr.node.right != null) {
                    q.add(new Info2(curr.hd+1, curr.node.right));
                }
            }
            for(int i = min; i <= max; i++) {
                System.out.print(map.get(i) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(6);
        BinaryTree tree = new BinaryTree();
        System.out.println("Diameter  = " + tree.diameter(root));
        System.out.println("Diameter  = " + tree.diameterOptimized(root).diam);
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(root.data + " " + subroot.data);
        System.out.println(tree.isSubtree(root, subroot));
        tree.topView(root);
        tree.BottomView(root);
    }
}