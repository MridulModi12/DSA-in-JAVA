public class _7_Subarrays {
    public static void printSubarrays(int array[]) {
        int i, j, k;
        int ts = 0;
        for(i = 0; i < array.length; i++) {
            for(j = i; j < array.length; j++) {
                for(k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total no of subarrays = " + ts);
    }
    public static void main(String[] args) {
        int arrays[] = {2, 4, 6, 8, 10};
        printSubarrays(arrays);
    }
}