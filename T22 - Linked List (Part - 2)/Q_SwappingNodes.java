public class Q_SwappingNodes {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void SwappingNodes(int x, int y) {
        if(x == y) {
            return;
        }
        Node temp1 = head;
        Node prev1 = null;
        while(temp1 != null && temp1.data != x) {
            prev1 = temp1;
            temp1 = temp1.next;
        }
        Node temp2 = head;
        Node prev2 = null;
        while(temp2 != null && temp2.data != y) {
            prev2 = temp2;
            temp2 = temp2.next;
        }
        if(temp1 == null || temp2 == null) {
            System.out.println("The nodes of values either x or y does not exist in the linked list");
            return;
        }
        if(prev1 == null) {
            head = temp2;
        } else {
            prev1.next = temp2;
        }
        if(prev2 == null) {
            head = temp1;
        } else {
            prev2.next = temp1;
        }
        
        Node temp = temp1.next;
        temp1.next = temp2.next;
        temp2.next = temp;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Q_SwappingNodes ll = new Q_SwappingNodes();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        ll.display();
        ll.SwappingNodes(1, 2);
        ll.display();
        ll.SwappingNodes(3, 4);
        ll.display();
    }
}