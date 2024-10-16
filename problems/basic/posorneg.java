import java.util.Scanner;

public class posorneg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the number to check(+/_): ");
        int number =sc.nextInt();

        String result = (number >= 0) ? "Positive" : "Negative";

        System.out.println("The number is " +result+ ".");
    }
}