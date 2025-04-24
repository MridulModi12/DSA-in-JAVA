import java.util.*;
public class except_multiple_of_10
{
    public static void main(String args[])
    {
        do 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n % 10 == 0) 
            {
                continue;
            }
            System.out.println("Number was : "+ n);
        } while(true);
    }
}