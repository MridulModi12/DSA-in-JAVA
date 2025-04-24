import java.util.*;
public class factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int fact = 1, num = n;
        while(n > 1) {
            fact *= n;
            n--;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }
}