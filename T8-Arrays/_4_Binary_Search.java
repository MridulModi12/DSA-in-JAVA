public class _4_Binary_Search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length;
        int mid = (start + end) / 2;
        while(start <= end) {
            if(key == numbers[mid]) {
                return mid;
            } else if(key > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("index for key is : " +  binarySearch(numbers, key));
    }
}