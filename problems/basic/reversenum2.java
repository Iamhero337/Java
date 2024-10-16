import java.util.*;

public class reversenum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the number to reverse: ");
        int num = sc.nextInt();

        int rev = 0;
//        int i = 0;
//        while(num > 0) {
//            i = num % 10;
//            rev = (rev*10) + i;
//            num = num/10;
//        }

        for(int i; num > 0; num= num/10) {
            i = num % 10;
            rev = (rev*10) + i;
        }

        System.out.println(rev);
    }
}
