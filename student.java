/* reate a Java program that:

Takes the student's name, age, marks, and whether they have an ID card (true/false) as input.
If the student scores 100 marks, print "Outstanding Performance!" (if)
Check if the student is 18 years or older.
If yes, print "Eligible for College Election".
Otherwise, print "Not Eligible for College Election". (if-else)
Assign a grade based on marks:
90–100 → Grade A
75–89 → Grade B
50–74 → Grade C
Below 50 → Fail (else-if ladder)
If the student is 18 or older, then check if they have an ID card.
If yes, print "Allowed to Enter Exam Hall".
Otherwise, print "ID Card Required".
If the student is below 18, print "Underage for Exam Hall Entry". (Nested if) */

import java.util.Scanner;

public class student {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Student Name: " );
          String name = sc.nextLine();
        System.out.print("Enter Student Age: " );
         int age = sc.nextInt();
        System.out.print("Enter Student Marks: " );
         int marks = sc.nextInt();
        System.out.print("Does the student have an ID card? " );
         boolean IDCard = sc.nextBoolean();

       
       
       
       

        if (marks == 100){
            System.out.println("Outstanding Performance!");
        }
        if(age>18){
            System.out.println("eligible for College Election");
        }
        else {
            System.out.println("Not Eligible for College Election");
        }

        if((marks>=90) && (marks<=100)){
            System.out.println("Grade A");

        }
        else if((marks>=75) && (marks<=89)){
            System.out.println("Grade B");
        }

        else if((marks>=50) && (marks<=74)){
            System.out.println("Grade C");
        }

        else if (marks<50)
        {
            System.out.println("Fail");
        }
        
        if(age>=18){

            if(IDCard){
                System.out.println("Allowed to Enter Exam Hall");
            }
            else{
                System.out.println("ID Card Required");
            }
        }
        sc.close();
    }
}