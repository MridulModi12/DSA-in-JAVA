import java.util.*;
public class _4_floyds_triangle {
    public static void floyd_triangle(int n) {
        int i, j, k;
        k = 1;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n = sc.nextInt();
        floyd_triangle(n);
    }
}
