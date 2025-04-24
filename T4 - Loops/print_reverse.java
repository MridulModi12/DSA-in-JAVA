import java.util.*;
public class print_reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int LastDigit;
        /*for(; n>0; n/=10){
            LastDigit = n % 10;
            System.out.print(LastDigit);
        }*/
        while(n > 0)
        {
            LastDigit = n % 10;
            System.out.print(LastDigit);
            n/=10;
        }
    }
}