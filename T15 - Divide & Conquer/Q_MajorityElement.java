public class Q_MajorityElement {
    public static int majorityElement(int arr[], int lo, int hi) {
        if(lo <= hi) {
            return arr[hi];
        }
        int mid = lo + (hi-lo)/2;
        int x = majorityElement(arr, lo, mid);
        int y = majorityElement(arr, mid+1, hi);
        if(x == y) {
            return x;
        } else {
            return occurrence(arr, lo, hi, x, y);
        }
    }
    public static int occurrence(int arr[], int lo, int hi, int x, int y) {
        int count_x = 0, count_y = 0;
        for(int i = lo; i <= hi; i++) {
            if(arr[i] == x) {
                count_x++;
            } else if(arr[i] == y) {
                count_y++;
            }
        }
        if(count_x > count_y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums, 0, nums.length-1));
        System.out.println(majorityElementRec(nums, 0, nums.length-1));
    }
    //following is pdf solutiion logic is same though. Just pasted it here for the comments
    private static int countInRange(int[] nums,int num,int lo,int hi) {
        int count = 0;
        for(int i = lo;i <= hi; i++) {
            if(nums[i] == num) {
                count++;
            }
        }
        return count;
    }
    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an arrayof size 1 is the majority
        // element.
        if(lo == hi) {
            return nums[lo];
        }
        // recurse on left and right halves of this slice.
        int mid = (hi-lo)/2 + lo;
        int left = majorityElementRec(nums,lo,mid);
        int right = majorityElementRec(nums,mid+1,hi);
        // if the two halves agree on the majorityelement, return it.
        if(left == right) {
            return left;
        }
        // otherwise, count each element and returnthe "winner".
        int leftCount = countInRange(nums,left,lo,hi);
        int rightCount = countInRange(nums,right,lo,hi);
        return leftCount>rightCount?left:right;
    }
}