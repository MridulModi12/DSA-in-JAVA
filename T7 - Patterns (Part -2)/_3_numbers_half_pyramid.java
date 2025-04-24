import java.util.*;
public class _3_numbers_half_pyramid {
    public static void numbers_inverted_half_pyramid(int n) {
        int i, j, s;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        numbers_inverted_half_pyramid(n);
    }
}
