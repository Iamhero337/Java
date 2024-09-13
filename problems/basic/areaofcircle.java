import java.util.*;

public class areaofcirlce {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        /*Here the f after the decimal value is used to tell
         * the editor that the value is float not double because 
         * java takes every decimal value as double to just be sure
         */


        System.out.println(area);

        
    }
}