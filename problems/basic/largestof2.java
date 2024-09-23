import java.util.Scanner;

public class largestof2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        // Check if a is greater than b
        if(a > b) {
            if (a == (int) a) {
                System.out.println((int) a + " is bigger");
            } else {
                System.out.println(a + " is bigger");
            }
        }
        // Check if both numbers are equal
        else if(a == b) {
            if (a == (int) a) {
                System.out.println((int) a + " and " + (int) b + " are equal");
            } else {
                System.out.println(a + " and " + b + " are equal");
            }
        }
        // Otherwise, b is greater
        else {
            if (b == (int) b) {
                System.out.println((int) b + " is bigger");
            } else {
                System.out.println(b + " is bigger");
            }
        }
    }
}
