public class _5_NthFibonacci {
    public static int nthFibonacci(int n) {
        if(n == 1 ||n == 2) {
            return n-1;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(nthFibonacci(8));
    }
}




//0,  1 , 1, 2, 3, 5,...,
//1   2   3  4  5  6 ......n