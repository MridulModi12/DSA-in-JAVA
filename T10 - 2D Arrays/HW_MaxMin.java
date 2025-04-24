import java.util.*;
public class HW_MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i, j;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(i = 0; i < arr.length; i++) {
            for(j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element : " + max);
        System.out.println("Minimum element : " + min);
    }
}