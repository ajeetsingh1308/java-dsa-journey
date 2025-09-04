package JavaFundamentals.BasicsJava;

import java.util.*;

public class ScannerClass {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String Name = scan.next();  // reads one word
        
        scan.nextLine(); // consume the leftover newline
        
        System.out.print("Enter your Full Name: ");
        String FullName = scan.nextLine();  // reads the full line
        
        System.out.print("Enter your age: ");
        int age = scan.nextInt();  // reads an integer
        
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        float height = scan.nextFloat();  // reads a floating-point number
        
        System.out.println("Your name is: " + Name);
        System.out.println("Your full name is: " + FullName);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height + " meters");
        scan.close();
    }
}