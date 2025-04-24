public class _1_CreatingLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;  // we made head as static so that we dont need to pass head to fns in which we use ll,
    //it will be same for all fns
    public static Node tail;
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        System.out.println(head.data + "->" + head.next.data);
    }
}