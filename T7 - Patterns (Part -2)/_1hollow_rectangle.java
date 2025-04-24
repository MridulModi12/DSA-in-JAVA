import java.util.*;
public class _1hollow_rectangle
{
    public static void hollow_rectangle(int r, int c) {
        int i, j;
        for(i = 1; i <= r; i++) {
            for(j = 1; j <= c; j++) {
                if(i == 1 || j == 1 || i == r || j == c) {
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
        int rows, columns;
        System.out.println("Enter the number of rows and columns : ");
        rows = sc.nextInt();
        columns = sc.nextInt();
        hollow_rectangle(rows, columns);
    }
}