import java.util.*;
public class Complex {
    static void add(int a, int b, int m, int n) {
        System.out.println((a + m) + " + (" + (b + n) + "i)");
    }
    static void diff(int a, int b, int m, int n) {
        System.out.println((m - a) + " + (" + (n - b) + "i)");
    }
    static void prod(int a, int b, int m, int n) {
        int A = (a * m) - (b * n);
        int B = (a * n) + (b * m);
        System.out.println(A + " + (" + B + "i)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary parts of 1st no. : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter real and imaginary parts of 2nd no. : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        add(a, b, m, n);
        diff(a, b, m, n);
        prod(a, b, m, n);
    }
}