public class _10_Subarrays_Kadanes_Alg {
    public static void kadanes(int array[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int i;
        for(i = 0; i < array.length; i++) {
            cs += array[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms , cs);
        }
        System.out.println("Our max subarray sum is : " + ms);
    }
    public static void main(String args[]) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(numbers);
    }
}