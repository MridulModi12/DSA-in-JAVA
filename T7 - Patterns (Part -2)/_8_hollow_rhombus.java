import java.util.*;
public class _8_hollow_rhombus {
    public static void hollow_rhombus(int n) {
        int i, j, s;
        for(i = 1; i <= n; i++) {
            for(s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }
            for(j = 1; j <= n; j++) {
                if(i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
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
        hollow_rhombus(n);
    }
}