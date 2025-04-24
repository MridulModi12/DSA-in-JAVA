//When the array given is sorted and rotated at a pivot, then we can use modified BinarySearch to search an element
public class _3_sortedRotatedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        if(si > ei) {
            return -1;
        }
        //kaam
        int mid = si + (ei-si)/2;
        //case FOUND
        if(arr[mid] == tar) {
            return mid;
        }
        if(arr[mid] > arr[si]) { //mid on line 1
            if(arr[si] <= tar && tar < arr[mid]) {
                return search(arr, tar, si, mid-1); //search on left
            } else {
                return search(arr, tar, mid+1, ei); //search on right
            }
        }
        else { //mid on line 2
            if(arr[mid] < tar && tar <= arr[ei]) {
                return search(arr, tar, mid+1, ei); //search on right
            } else {
                return search(arr, tar, si, mid-1); //search on left
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}