public class Q4_OddEvenLL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void seggregateEvenOdd() {
        Node even = null;
        Node evenStart = null;
        Node odd = null;
        Node oddStart = null;
        Node curr = head;
        while(curr != null) {
            if(curr.data % 2 == 0) {
                if(evenStart == null) {
                    evenStart = curr;
                    even = curr;
                } else {
                    even.next = curr;
                    even = even.next;
                }
            } else {
                if(oddStart == null) {
                    oddStart = curr;
                    odd = curr;
                } else {
                    odd.next = curr;
                    odd = odd.next;
                }
            }
            curr = curr.next;
        }
        if(even != null) {
            even.next = oddStart;
            head = evenStart;
        }
        if(odd != null) {
            odd.next = null;
        }
        if(even == null && odd != null) {
            head = oddStart;
        }
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
        Q4_OddEvenLL ll = new Q4_OddEvenLL();
        head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);
        head.next.next.next = new Node(9);
        ll.display();
        ll.seggregateEvenOdd();
        ll.display();
    }
}