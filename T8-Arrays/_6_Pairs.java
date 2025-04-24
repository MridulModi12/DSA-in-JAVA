public class _6_Pairs {
    public static void printPairs(int array[]) {
        int i, j, tp = 0;
        for(i = 0; i < array.length; i++) {
            for(j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] +  " , " + array[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }
    public static void main(String[] args) {
        int array[] = {2, 4, 6, 8, 10};
        printPairs(array);
    }
}