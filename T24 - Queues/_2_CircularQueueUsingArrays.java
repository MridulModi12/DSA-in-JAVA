public class _2_CircularQueueUsingArrays {
    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;
        Queue(int n) {
            arr = new int[n];
            size = n;
            front = rear = -1;
        }

        boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) {  //if adding first time
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removed = arr[front];
            if(front == rear) {   //if removing last element
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return removed;
        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}