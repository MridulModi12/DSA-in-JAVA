public class Q4_CountingSort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int i;
        int j = 0;
        for(i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        int count[] = new int[largest + 1];
        for(i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for(i = count.length - 1; i >= 0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int arr[]) {
        int i;
        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        countingSort(arr);
        printArr(arr);
    }
}
