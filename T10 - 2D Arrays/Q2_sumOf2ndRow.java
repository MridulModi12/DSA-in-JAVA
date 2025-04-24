public class Q2_sumOf2ndRow {
    public static void main(String[] args) {
        int nums[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};
        int j;
        int sum = 0;
        for(j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("Sum : " + sum);
    }
}