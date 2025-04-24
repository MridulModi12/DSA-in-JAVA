import java.util.*;
public class cost
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of penecil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println("Total Cost of items: " + cost);
        float gst = (18f/100f) * cost;
        System.out.println("Total GST: " + gst);
        System.out.println("Total Cost inclusive of GST: " + (cost + gst));
    }
}