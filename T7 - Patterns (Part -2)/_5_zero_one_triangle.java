import java.util.*;
public class _5_zero_one_triangle {
    public static void zero_one_triangle(int n) {
        int i, j, k;
        k = 1;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n = sc.nextInt();
        zero_one_triangle(n);
    }
}
