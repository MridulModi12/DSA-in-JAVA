import java.util.Scanner;
public class _1_Creation2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}