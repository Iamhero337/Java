import java.util.*;

public class dayofweeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give the number of the day: ");
        int numberofday = sc.nextInt();

        switch(numberofday) {
            case 1 : System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3: System.out.println("Tuesday");
                break;
            case 4: System.out.println("Wednesday");
                break;
            case 5: System.out.println("Thrusday");
                break;
            case 6: System.out.println("Friday");
                break;
            case 7: System.out.println("Saturday");
                break;
            default : System.out.println("This is not a valid number for a date.");
        }
    }
}
