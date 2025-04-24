import java.util.*;
public class _6_butterfly_pattern {
    public static void butterfly_pattern(int n) {
        int i, j, s;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(s = 1; s <= (n - i) * 2; s++) {
                System.out.print("  ");
            }
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i = n; i >= 1; i--) {
            for(j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for(s = 1; s <= (n - i) * 2; s++) {
                System.out.print("  ");
            }
            for(j = 1; j <= i; j++) {
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
        butterfly_pattern(n);
    }
}
