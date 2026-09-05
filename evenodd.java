import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        sc.close();
    }

    public static boolean isEven(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}