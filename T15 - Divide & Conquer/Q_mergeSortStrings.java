public class Q_mergeSortStrings {
    public static void printArr(String arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(String arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei) {
            int l = 0; // pointer to keep track of characters of individual strings from the array
            String a = arr[i];
            String b = arr[j];
            while(a.charAt(l) - b.charAt(l) == 0 && l < a.length()-1 && l < b.length()-1) { //to bring l to the first different characters in a and b
                l++;
            }
            if(a.charAt(l) == b.charAt(l)) { //if suppose a is "merc" and b is "mercury" then to avoid out of bounds i put [l < a.length()-1 && l < b.length()-1] condition
                if(a.length() < b.length()) { // merc is smaller than mercury
                    temp[k] = a;
                    i++;
                } else {
                    temp[k] = b;
                    j++;
                }
            }
            else if(a.charAt(l) < b.charAt(l)) { //comparing the first different chars of a and b
                temp[k] = a;
                i++;
            } else {
                temp[k] = b;
                j++;
            }
            k++;
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy to original array
        for(i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mercury", "merc"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}