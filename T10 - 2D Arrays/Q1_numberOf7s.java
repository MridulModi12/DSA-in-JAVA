public class Q1_numberOf7s {
    public static int numberOf7s(int matrix[][]) {
        int i, j;
        int c = 0;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 7) {
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};
        int n = numberOf7s(matrix);
        System.out.println("Number of 7 in the 2D array : " + n);
    }
}