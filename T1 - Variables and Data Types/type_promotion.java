import java.util.*;
public class type_promotion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char a = 'a';
        char b = 'b';
        //char c = a-b;     //lossy conversion from int to char
         System.out.println((int) a);
         System.out.println((int) b);
        System.out.println(b-a);
        
        short s = 5;
        byte by = 25;
        char ch = 'm';
        //byte bt = (s + by + ch);  //lossy conversion from int to byte
        byte bt = (byte) (s + by + ch);
        System.out.println(bt);

        int i = 34;
        float f = 76.43f;
        double d = 3.4;
        long l = 4632;
        //int ans = (i+f+d+l);  //lossy conversion from double to int
        int ans = (int) (i+f+d+l);
        System.out.println(ans);

        byte byt = 5;
        byt = (byte) (byt*2);
        System.out.println(byt);
    }
}