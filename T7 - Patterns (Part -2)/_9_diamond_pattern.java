import java.util.*;
public class _9_diamond_pattern {
    public static void diamond_pattern(int n) {
        int i, j, s;
        for(i = 1; i <= n; i++) {
            for(s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for(j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i = n; i >= 1; i--) {
            for(s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for(j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n = sc.nextInt();
        diamond_pattern(n);
    }
}