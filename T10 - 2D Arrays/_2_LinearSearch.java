public class _2_LinearSearch {
    public static boolean searchKey(int matrix[][], int key) {
        int i, j;
        for(i = 0; i < matrix.length; i++) {
            for(j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("key is at index (" + i + " , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{21, 31, 32}, 
                          {2, 5, 1}, 
                          {54, 45, 75}};
        int key = 74;
        searchKey(matrix, key);
    }
}
