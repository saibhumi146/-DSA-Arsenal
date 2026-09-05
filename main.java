/* Problem Statement: Find the Square

Write a Java program using a method to find the square of a number.

Requirements:

Take an integer num as input from the user.
Create a method named square.
The method should take num as a parameter.
The method should return the square of the number.
Print the returned result in main(). */

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int result = square(num);  // Calling the square method and storing the result

        System.out.println("Square = " + result);

        sc.close();
    }

    public static int square(int num) {

        int zeon = num * num;

        return zeon;
    }
}
   
