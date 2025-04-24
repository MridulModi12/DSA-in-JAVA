public class _5_CircularSingleLL {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node addToEmpty(Node last, int data) {
        if(last != null) {
            System.out.println("Circular Linked List is not empty");
            return last;
        }
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        return last;
    }

    static Node addFront(Node last, int data) {
        if(last == null) {
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }

    static Node addEnd(Node last, int data) {
        if(last == null) {
            return addToEmpty(last, data);
        }
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
        return last;
    }

    static Node addAfter(Node last, int data, int item) {
        if(last == null) {
            return null;
        }
        Node temp = last.next;
        do {
            if(temp.data == item) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                if(temp == last) {
                    last = newNode;
                }
                return last;
            }
            temp = temp.next;
        } while(temp != last.next);
        System.out.println("The given item is not present in the Circular Linked List");
        return last;
    }

    static Node deleteNode(Node last, int key) {
        if(last == null) {
            return null;
        }
        if(last.data == key && last.next == last) {  //single node
            last = null;
            return last;
        }
        Node temp = last;
        if(last.data == key) {  //key at last node 
            while(temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp;
        }
        while(temp.next != last && temp.next.data != key) {  //key somewhere at middle
            temp = temp.next;
        }
        if(temp.next.data == key) {
            Node d = temp.next;
            temp.next = d.next;
        }
        return last;
    }

    static void traverse(Node last) {
        Node temp = last.next;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while(temp != last.next);
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Node last = null;
        last = addToEmpty(last, 6);
        last = addEnd(last, 8);
        last = addFront(last, 2);
        last = addAfter(last, 10, 2);
        traverse(last);
        deleteNode(last, 8);
        traverse(last);
    }
}