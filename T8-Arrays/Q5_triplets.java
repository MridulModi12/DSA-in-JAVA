public class Q5_triplets
{
    public static void triplets(int nums[]) {
        int i, j, k;
        int n = nums.length;
        for(i = 0; i < n - 2; i++) {
            for(j = i + 1; j < n; j++) {
                for(k = i + 2; j < n; j ++) {
                    if((nums[i] + nums[j] + nums[k]) == 0) {
                        System.out.print("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "] ,");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        triplets(nums);
    }
}