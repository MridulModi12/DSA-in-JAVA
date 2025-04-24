import java.util.*;
public class _3_SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = matrix.length - 1;
        int EndCol = matrix[0].length - 1;
        while(StartRow <= EndRow && StartCol <= EndCol) {
            //top
            for(int j = StartCol; j <= EndCol; j++) {
                System.out.print(matrix[StartRow][j] + " ");
            }
            //right
            for(int i = StartRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }
            //bottom
            for(int j = EndCol - 1; j >= StartCol; j--) {
                if(StartRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][j] + " ");
            }
            //left
            for(int i = EndRow - 1; i >= StartRow + 1; i--) {
                if(StartCol == EndCol) {
                    break;
                }
                System.out.print(matrix[i][StartCol] + " ");
            }
            //update to go to inner boundaries
            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column size");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        int i , j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printSpiral(matrix);
    }
}