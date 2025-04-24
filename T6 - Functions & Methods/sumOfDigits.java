import java.util.*;
public class sumOfDigits {

    public static int digitsSum(int n) {
        int d, s = 0;
        while(n > 0) {
            d = n % 10;
            s += d;
            n /= 10;
        }
        return s;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        n = sc.nextInt();
        System.out.println("Sum of digits : " + digitsSum(n));
    }
}
