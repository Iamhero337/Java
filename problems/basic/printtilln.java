import java.util.*;

public class printtilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the n: ");
        int n = sc.nextInt();

        int counter=1;
        while(counter <= n) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
