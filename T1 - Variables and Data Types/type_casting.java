import java.util.*;
public class type_casting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float marks = 99.99f;
        int marks2 = (int)marks;
        System.out.println(marks2);

        char ch = 'a';
        char ch2 = 'b';
        int number = ch;
        int number2 = ch2;
        System.out.println(number);
        System.out.println(number2);
    }
}