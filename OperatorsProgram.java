import java.util.Scanner;

public class OperatorsProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\n----- Arithmetic Operators -----");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder = " + (a % b));

        // Assignment Operator
        int c = a;
        c += b;
        System.out.println("\nAfter c += b : " + c);

        // Relational Operators
        System.out.println("\n----- Relational Operators -----");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // Logical Operators
        System.out.println("\n----- Logical Operators -----");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
        System.out.println("!(a > b) : " + !(a > b));

        // Unary Operators
        System.out.println("\n----- Unary Operators -----");
        System.out.println("Original a = " + a);

        a++;
        System.out.println("After a++ = " + a);

        b--;
        System.out.println("After b-- = " + b);

        // Ternary Operator
       int max = (a > b) ? a : b;

        System.out.println("\n----- Ternary Operator -----");
        System.out.println("Maximum Number = " + max);

        sc.close();
    }
}
