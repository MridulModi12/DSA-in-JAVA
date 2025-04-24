public class _4_modifiedBinarySearch {
    public static int iterativeSearch(int arr[], int tar) {
        int si = 0;
        int ei = arr.length-1;
        int mid = si + ei-si/2;
        while(si < ei) {
            if(arr[mid] == tar) {
                return mid;
            }
            if(arr[mid] > arr[si]) {
                if(arr[si] <= tar && tar < arr[mid]) {
                    ei = mid-1;
                } else {
                    si = mid+1;
                }
            } else {
                if(arr[mid] <= tar && tar < arr[ei]) {
                    si = mid+1;
                } else {
                    ei = mid-1;
                }
            }
            mid = si + ei-si/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 2;
        System.out.println(iterativeSearch(arr, tar));
    }
}