import java.util.*;
public class Input
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //String input = sc.next();//yeh sirf next line(or space) tak hi capturte karta hai
        //System.out.println(input);
        String name=sc.nextLine();
        System.out.println(name);
        int number = sc.nextInt();
        System.out.println(number);
        float price = sc.nextFloat();
        System.out.println(price);
    }
}
    