import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < Math.sqrt(n); i++)
        {
            if(n % i == 0) // n is a multiple of i (i not equal to 1 or n)
            {
                isPrime = false;
            }
        }
        if(isPrime == true)
        {
            System.out.println("The entered number is prime");
        }
        else
        {
            System.out.println("The entered number is not prime");
        }
    }
}