public class _3_QueueUsingLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        boolean isEmpty() {
            return head == null && tail == null;
        }

        void add(int data) {
            Node newNode = new Node(data);
            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = head.data;
            if(head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return removed;
        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }   
}