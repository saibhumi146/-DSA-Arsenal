import java.util.Scanner;
public class StudentInfo{
      
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your cgpa: ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter your grade:");
        char grade =  sc.next().charAt(0);

        System.out.print("Are you placed in a company? (true/false): ");
        boolean isPlaced = sc.nextBoolean();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);      
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
        System.out.println("Placed: " + isPlaced);

        System.out.printf(
    "\n%s is %d years old and has a CGPA of %.2f",
    name,
    age,
    cgpa
);

        sc.close();

    }

}