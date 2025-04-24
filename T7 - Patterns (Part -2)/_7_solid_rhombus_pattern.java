import java.util.*;
public class _7_solid_rhombus_pattern {
    public static void solid_rhombus(int n) {
        int i, j, s;
        for(i = 1; i <= n; i++) {
            for(s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for(j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n = sc.nextInt();
        solid_rhombus(n);
    }
}