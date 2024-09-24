import java.util.*;

public class incometaxcal {
    public static void main (String args[]) {

    Scanner sc = new Scanner(System.in);

    float income = sc.nextFloat();

    if(income < 500000) {
        System.out.println("Jaa khus reh munna.");
    }
    else if(income >= 500000 && income <= 1000000) {
        System.out.println("Aao raja 20% dedo Raja");
    }
    else {
        System.out.println("Hua bakra hallal 30% bracket.");
    }
}
}