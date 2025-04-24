public class _7_FirstOccurence {
    public static int firstOccurence(int arr[], int n, int key) {
        if(n == arr.length) {
            return -1;
        }
        if(arr[n] == key) {
            return n;
        }
        return firstOccurence(arr, n+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2, 2, 2, 3};
        System.out.println(firstOccurence(arr, 0, 7));
    }
}



//1 3 4 2 2 2 2 3
//0 1 2 3 4 5 6 7 