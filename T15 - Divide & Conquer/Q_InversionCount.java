public class Q_InversionCount {
    public static int inversionCount(int arr[], int lo, int hi) {
        if(lo >= hi) {
            return 0;
        }
        int mid = lo + (hi-lo)/2;
        int x = inversionCount(arr, lo, mid);
        int y = inversionCount(arr, mid+1, hi);
        return x + y + mergeCount(arr, lo, mid, hi);
    }
    public static int mergeCount(int arr[], int lo, int mid, int hi) {
        int temp[] = new int[hi-lo+1];
        int i = lo;
        int j = mid+1;
        int k = 0;
        int count = 0;
        while(i <= mid && j <= hi) {
            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                count += (mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= hi) {
            temp[k++] = arr[j++];
        }
        for(i = lo, k = 0; i <= hi; i++,k++) {
            arr[i] = temp[k]; 
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        System.out.println(inversionCount(arr, 0, arr.length-1));
    }
}