import java.util.Collections;
import java.util.Arrays;

public class _2_InbuiltSort {
    public static void printArr(Integer arr[]) {
        int i;
        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {3,6,2,1,8,7,4,5,3,1};
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        printArr(arr);
        Arrays.sort(arr, 0, 4);
        printArr(arr);
    }
}