import java.util.*;
public class _2_inverted_rotated_half_pyramid {
    public static void inverted_rotated_half_pyramid(int n) {
        int i, j, s;
        for(i = 1; i <= n; i++) {
            for(s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        inverted_rotated_half_pyramid(n);
    }
}
