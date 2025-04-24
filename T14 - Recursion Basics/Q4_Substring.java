public class Q4_Substring {
    public static int substring(String str, int i, int j, int n) {
        if(n == 1) {
            return 1;
        }
        if(n <= 0) {
            return 0;
        }
        /*i and j are pointers. i starts from starting of string and j from end.
        Either i increments or j decrements (leaving n-1 string length)
        or both i and j moves(leaving n-2 string length)
        A------>substring(str, i+1, j, n-1)
        B------>substring(str, i, j-1, n-1)
        A intersection B --------> substring(str, i+1, j-1, n-2)
        AUB = A + B - A INTERSECTION B
        */
        int res = substring(str, i+1, j, n-1) + substring(str, i, j-1, n-1) - substring(str, i+1, j-1, n-2);
        if(str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(substring(str, 0, str.length() - 1, str.length()));
    }
}
