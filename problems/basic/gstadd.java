import java.util.*;

public class gstadd {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The price cost of the  Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("The price cost of the  Pen: ");
        float pen    = sc.nextFloat();
        System.out.print("The price cost of the  Eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        // float gst = total * 18/100; this logic not better then the implemented one.

        float fprice = total + (0.18f * total);

        System.out.println("The total cost is: " + total);
        System.out.print("The price with gst is: " + fprice);

         

    }
}