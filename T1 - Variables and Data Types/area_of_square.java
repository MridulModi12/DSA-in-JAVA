import java.util.*;
public class area_of_square
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        float area = side * side;
        System.out.println("Area of Square: "+ area);
    }
}