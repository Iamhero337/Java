import java.util.*;

public class reversenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the number to reverse it: ");
        int num = sc.nextInt();

        int pr = 0;
        while(num > 0) {
            pr = num%10;
            System.out.print(pr);
            num = num/10;
        }
    }
}
