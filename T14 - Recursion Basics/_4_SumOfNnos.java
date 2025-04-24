public class _4_SumOfNnos {
    public static int sumOfNnos(int n) {
        if(n == 1) {
            return 1;
        }
        return n + sumOfNnos(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNnos(6));
    }
}



//1+2+...+n