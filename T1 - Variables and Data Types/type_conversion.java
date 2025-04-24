import java.util.*;
public class type_conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        /*long a = 25;
        int b = a; */   // lossy conversion
        int a = 25;
        long b = a;
        System.out.println(b);
        /*int number = sc.nextFloat();
        System.out.println(number);*/   //lossy conversion
        float number = sc.nextInt();
        System.out.println(number);
    }
}