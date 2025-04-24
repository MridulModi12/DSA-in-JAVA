public class Q3_MatrixTranspose {
    public static void MatrixTranspose(int matrix[][]) {
        int mat[][] = new int[matrix[0].length][matrix.length];
        int i, j;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                mat[j][i] = matrix[i][j];
            }
        }
        print2DArray(mat);
    }
    public static void print2DArray(int matrix[][]) {
        int i, j;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6}};
        MatrixTranspose(matrix);
    }
}