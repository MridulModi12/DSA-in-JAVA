public class Q2_Swap {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        System.out.println("a before swapping = " + a);
        System.out.println("b before swapping = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a after swapping = " + a);
        System.out.println("b after swapping = " + b);
    }
}