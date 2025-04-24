public class _4_DiagonalSum {
    public static void diagonalSum(int matrix[][]) {
        //brute force
        int i, j;
        int sum = 0;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                else if(i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum : " + sum);
    }
    public static void diagonalSum_Optimized(int matrix[][]) {
        int sum = 0;
        int i;
        for(i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if(i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        System.out.println("Diagonal Sum : " + sum);
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        diagonalSum_Optimized(matrix);
    }
}
