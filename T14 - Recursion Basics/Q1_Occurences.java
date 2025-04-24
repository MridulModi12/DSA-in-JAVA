public class Q1_Occurences {
    public static void occurences(int arr[], int key, int n) {
        if(n == arr.length) {
            return;
        }
        if ((arr[n] == key)) {
            System.out.print(n + " ");
        }
        occurences(arr, key, n+1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        occurences(arr, 2, 0);
    }
}
