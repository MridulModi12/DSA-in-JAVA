import java.util.LinkedList;
public class _2_JavaCollectionsFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.add(55);
        System.out.println(ll);
        System.out.println(ll.element());
    }
}