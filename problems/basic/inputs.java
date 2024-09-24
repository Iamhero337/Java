import java.util.Scanner;

public class DataTypeInput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Taking input of different data types

        // Integer input
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        // Float input
        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();

        // Double input
        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();

        // Character input
        System.out.print("Enter a character: ");
        char charValue = sc.next().charAt(0); // Using charAt(0) to read a single character

        // String input
        System.out.print("Enter a string: ");
        sc.nextLine(); // Consume the remaining newline
        String stringValue = sc.nextLine();

        // Boolean input
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = sc.nextBoolean();
        
          // Extremely large BigDecimal
        BigDecimal bigDecimal = new BigDecimal("12345678901234567890123456789012345678901234567890.12345678901234567890");
       

        // Extremely large BigInteger
        BigInteger bigInteger = new BigInteger("123456789012345678901234567890123456789012345678901234567890");
        

        // Printing the inputs
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("String: " + stringValue);
        System.out.println("Boolean: " + boolValue);
        System.out.println("BigDecimal: " + bigDecimal);
        System.out.println("BigInteger: " + bigInteger);

        

    }
}


// Enter an integer: 5
// Enter a float: 3.14
// Enter a double: 6.28318
// Enter a character: A
// Enter a string: Hello, Java!
// Enter a boolean value (true/false): true
// 
// You entered:
// Integer: 5
// Float: 3.14
// Double: 6.28318
// Character: A
// String: Hello, Java!
// Boolean: true
// 