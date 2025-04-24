public class _9_Subarrays_prefixSum {
    public static void maxSubarraySum(int array[]) {
        int i, j;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + array[i];
        }
        for(i = 0; i < array.length; i++) {
            int start = i;
            for(j = i; j < array.length; j++) {
                int end = j;
                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(currSum > max) {
                    max = currSum;
                }
            }
        }
        System.out.println("Maximum sum : " + max);
    }
    public static void main(String[] args) {
        int arrays[] = {2, 4, 6, 8, 10};
        maxSubarraySum(arrays);
    }
}
