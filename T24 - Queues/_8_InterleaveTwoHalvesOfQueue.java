import java.util.*;
public class _8_InterleaveTwoHalvesOfQueue {
    static void interleaveTwoHalvesOfQueue(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i = 0; i < size/2; i++) {
            firstHalf.add(q.remove());
        }
        while(!q.isEmpty()) {
            System.out.print(firstHalf.remove() + " ");
            System.out.print(q.remove() + " ");
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaveTwoHalvesOfQueue(q);
    }
}