public class _1_DetectingRemovingCycle {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        slow = head;
        Node prev = null;
        while(slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        _1_DetectingRemovingCycle ll = new _1_DetectingRemovingCycle();
        head = new Node(10);
        Node p = new Node(20);
        head.next = p;
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = p;
        System.out.println(ll.isCycle());
        if(ll.isCycle() == true) {
            ll.removeCycle();
        }
        System.out.println(ll.isCycle());
    }
}