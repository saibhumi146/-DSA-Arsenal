import java.util.Scanner;

public class string14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String string = sc.nextLine();

        boolean onlydigits = true;

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            if (!(current >= '0' && current <= '9'))  {

                onlydigits = false;

                break;

            }

        }
        if (onlydigits) {
            System.out.println("string only contain digits");
        } else {
            System.out.println("string does not only conntains digits");
        }
        sc.close();
    }
}

