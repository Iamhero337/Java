import java.util.*;

public class switchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give option number: ");
        int option = sc.nextInt();

        switch(option) {
            case 0 : System.out.println("Short circuit.");
                    break;
            case 1 : System.out.println("On");
                    break;
            case 2 : System. out.println("Off");
                    break;
            default : System.out.println("Your brain is off.");

        }


    }
}