import java.util.*;
public class Q1_duplicate_array {
    public static boolean containsDuplicate(int nums[]) {
        int i, j;
        int n = nums.length;
        for(i = 0; i < n - 1; i++) {
            for(j = i + 1; j < n; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(nums));
    }
}