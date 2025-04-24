public class _8_Subarrays_max_min {
    public static void max_min_Subarrays(int array[]) {
        int i, j, k;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(i = 0; i < array.length; i++) {
            for(j = i; j < array.length; j++) {
                int sum = 0;
                for(k = i; k <= j; k++) {
                    sum += array[k];
                }
                if(sum > max) {
                    max = sum;
                }
                if(sum < min) {
                    min = sum;
                }
            }
        }
        System.out.println("Maximum sum : " + max);
        System.out.println("Minimum sum : " + min);
    }
    public static void main(String[] args) {
        int arrays[] = {2, 4, 6, 8, 10};
        max_min_Subarrays(arrays);
    }
}