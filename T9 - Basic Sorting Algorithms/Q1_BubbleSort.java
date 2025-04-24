public class Q1_BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length - 1; turn++) {
            for(int j = 0; j < arr.length - 1 - turn; j++) {
                if(arr[j + 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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
        bubbleSort(arr);
        printArr(arr);
    }
}