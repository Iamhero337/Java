import java.util.*;

public class printsumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give n to get the sum till it: ");
        int n = sc.nextInt();

        int total = 0;
        int counter = 1;

        System.out.print("The total sum of till " + n);

        while(counter <= n) {
            total = total + counter;
            counter++;
        }

        System.out.println(" is " + total + ".");

    }
}
