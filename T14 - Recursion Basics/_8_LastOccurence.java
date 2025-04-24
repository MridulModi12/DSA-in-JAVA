public class _8_LastOccurence {
    public static int lastOccurence(int arr[], int n, int key) {
        if(n == arr.length) {
            return -1;
        }
        int x = lastOccurence(arr, n+1, key);
        if(arr[n] == key && x == -1) {
            return n;
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 2, 2, 2, 2, 3};
        System.out.println(lastOccurence(arr, 0, 2));
    }
}




//1 3 4 2 2 2 2 3
//0 1 2 3 4 5 6 7 